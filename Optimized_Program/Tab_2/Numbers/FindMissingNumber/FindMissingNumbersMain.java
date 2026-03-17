package Optimized_Program.Tab_2.Numbers.FindMissingNumber;


import java.util.Scanner;
import java.util.Set;

/**
 * Main class to execute missing number program.
 */
public class FindMissingNumbersMain {

    public static void main(String[] args) {

        // Auto-close Scanner using try-with-resources
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter how many numbers you will input: ");
            int size = sc.nextInt();

            // Validate input size
            if (size <= 0) {
                System.out.println("Invalid input size!");
                return;
            }

            int[] arr = new int[size];

            System.out.println("Enter numbers between (0 to 100):");

            // Take array input
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Call logic method
            Set<Integer> missing = FindMissingNumbers.findMissing(arr);

            // Display result
            System.out.println("\nMissing numbers are:");
            for (int num : missing) {
                System.out.print(num + " ");
            }
        }
    }
}
