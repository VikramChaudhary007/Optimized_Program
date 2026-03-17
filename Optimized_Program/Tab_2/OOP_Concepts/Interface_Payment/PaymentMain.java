package Optimized_Program.Tab_2.OOP_Concepts.Interface_Payment;


// Main class (execution starts here)
public class PaymentMain {

    public static void main(String[] args) {

        // Create CreditCard object using interface reference
        PaymentMethod p1 = new CreditCard("Rahul");

        // Create UPI object using interface reference
        PaymentMethod p2 = new UPI("rahul@upi");

        // Perform payments
        p1.pay(500);
        p2.pay(300);
    }
}