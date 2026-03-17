import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // -------------------------------
        // Reverse String (Built-in method)
        // -------------------------------

        // Using StringBuilder's reverse() method (fast and efficient)
        StringBuilder reverse = new StringBuilder(str).reverse();

        // -------------------------------
        // Count Vowels
        // -------------------------------
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {

            // Convert character to lowercase for uniform comparison
            char ch = Character.toLowerCase(str.charAt(i));

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // -------------------------------
        // Display Results
        // -------------------------------
        System.out.println("Reverse String: " + reverse);
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("String Length: " + str.length());

        // Close scanner to prevent resource leak
        sc.close();
    }
}