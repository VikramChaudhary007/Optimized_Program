package Optimized_Program.Tab_2.OOP_Concepts.Inheritance_Vehicle;


// Parent class (Base class)
public class Vehicle {

    private String brand; // vehicle brand
    private int speed;    // vehicle speed

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method to start vehicle
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Method to stop vehicle
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}
