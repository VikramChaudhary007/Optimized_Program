package Optimized_Program.Tab_2.Array_Programs.SecondLargestNumber;


public class SecondLargestNumber {

    public static int findSecondLargest(int[] arr) {

        // Check if array is null or has less than 2 elements
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        // Initialize largest and second largest with minimum possible value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int num : arr) {

            // If current number is greater than largest
            if (num > largest) {

                // Update second largest before updating largest
                secondLargest = largest;

                // Update largest
                largest = num;

            }
            // If number is smaller than largest but greater than secondLargest
            // Also ensure it is not equal to largest (to handle duplicates)
            else if (num > secondLargest && num != largest) {

                // Update second largest
                secondLargest = num;
            }
        }

        // If secondLargest is still MIN_VALUE, no valid second largest found
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        // Return result
        return secondLargest;
    }
}
