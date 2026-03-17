package Optimized_Program.Tab_2.OOP_Concepts.Inheritance_Vehicle;


// Bike class inherits from Vehicle
public class Bike extends Vehicle {

    private boolean hasHelmet; // helmet availability

    // Getter
    public boolean isHasHelmet() {
        return hasHelmet;
    }

    // Setter
    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    // Display bike details
    public void showBikeDetails() {

        // Access parent class data using getters
        System.out.println("Bike Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Helmet Available: " + hasHelmet);
    }
}
