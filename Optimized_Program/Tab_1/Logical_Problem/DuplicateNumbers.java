import java.util.HashSet;

public class DuplicateNumbers {

    public static void main(String[] args) {

        // Input array
        int arr[] = {1, 2, 3, 2, 5, 1};

        // Set to store visited elements
        HashSet<Integer> seen = new HashSet<>();

        // Set to store duplicate elements
        HashSet<Integer> duplicates = new HashSet<>();

        // -------------------------------
        // Find duplicates
        // -------------------------------
        for (int num : arr) {

            // If element already exists → duplicate
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // -------------------------------
        // Display duplicates
        // -------------------------------
        System.out.println("Duplicate numbers are:");

        for (int num : duplicates) {
            System.out.println(num);
        }
    }
}