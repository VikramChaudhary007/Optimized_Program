package Optimized_Program.Tab_2.OOP_Concepts.Interface_Payment;


// CreditCard class implements PaymentMethod interface
public class CreditCard implements PaymentMethod {

    private String cardHolderName; // encapsulated field

    // Constructor to initialize card holder name
    public CreditCard(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    // Getter
    public String getCardHolderName() {
        return cardHolderName;
    }

    // Setter
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    // Implement pay() method
    @Override
    public void pay(double amount) {

        // Print payment using credit card
        System.out.println("Payment of " + amount +
                " done using Credit Card by " + cardHolderName + ".");
    }
}
