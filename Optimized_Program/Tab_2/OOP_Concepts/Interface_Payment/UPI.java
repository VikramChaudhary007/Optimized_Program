package Optimized_Program.Tab_2.OOP_Concepts;


// UPI class implements PaymentMethod interface
public class UPI implements PaymentMethod {

    private String upiId; // encapsulated field

    // Constructor
    public UPI(String upiId) {
        this.upiId = upiId;
    }

    // Getter
    public String getUpiId() {
        return upiId;
    }

    // Setter
    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    // Implement pay() method
    @Override
    public void pay(double amount) {

        // Print payment using UPI
        System.out.println("Payment of " + amount +
                " done using UPI ID: " + upiId + ".");
    }
}
