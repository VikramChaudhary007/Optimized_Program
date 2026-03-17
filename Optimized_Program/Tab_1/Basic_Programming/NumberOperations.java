import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // -------------------------------
        // Check whether number is Even or Odd
        // -------------------------------
        if (num % 2 == 0) {
            System.out.println("Number is Even");  // If divisible by 2 → Even
        } else {
            System.out.println("Number is Odd");   // Otherwise → Odd
        }

        // -------------------------------
        // Check whether number is Prime or Not
        // -------------------------------

        // Assume number is prime initially
        boolean isPrime = true;

        // Numbers less than or equal to 1 are NOT prime
        if (num <= 1) {
            isPrime = false;
        } else {

            // Loop from 2 to square root of number
            // This improves performance compared to num/2
            for (int i = 2; i <= Math.sqrt(num); i++) {

                // If number is divisible by i → Not Prime
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop early (optimization)
                }
            }
        }

        // -------------------------------
        // Display Prime Result
        // -------------------------------
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }

        // Close scanner to prevent resource leak
        sc.close();
    }
}