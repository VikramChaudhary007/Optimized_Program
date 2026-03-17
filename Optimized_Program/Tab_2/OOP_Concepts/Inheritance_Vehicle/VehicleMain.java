package Optimized_Program.Tab_2.OOP_Concepts.Inheritance_Vehicle;


// Main class (execution)
public class VehicleMain {

    public static void main(String[] args) {

        // Create Car object
        Car c1 = new Car();

        // Set values using setters
        c1.setBrand("Toyota");
        c1.setSpeed(120);
        c1.setDoors(4);

        c1.start();              // inherited method
        c1.showCarDetails();    // child method
        c1.stop();

        System.out.println();

        // Create Bike object
        Bike b1 = new Bike();

        // Set values using setters
        b1.setBrand("Splendor");
        b1.setSpeed(90);
        b1.setHasHelmet(true);

        b1.start();              // inherited method
        b1.showBikeDetails();    // child method
        b1.stop();
    }
}