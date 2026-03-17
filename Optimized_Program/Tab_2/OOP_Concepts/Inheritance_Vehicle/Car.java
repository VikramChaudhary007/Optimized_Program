package Optimized_Program.Tab_2.OOP_Concepts.Inheritance_Vehicle;


// Car class inherits from Vehicle
public class Car extends Vehicle {

    private int doors; // number of doors

    // Getter
    public int getDoors() {
        return doors;
    }

    // Setter
    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Display car details
    public void showCarDetails() {

        // Access parent class data using getters
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Doors: " + doors);
    }
}
