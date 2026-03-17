package Optimized_Program.Tab_2.Array_Programs.SecondLargestNumber;


public class SecondLargestNumberMain {

    public static void main(String[] args) {

        // Input array
        int[] arr = {10, 25, 8, 40, 15, 35};

        try {
            // Call method to find second largest number
            int result = SecondLargestNumber.findSecondLargest(arr);

            // Print result
            System.out.println("Second Largest Number: " + result);

        } catch (IllegalArgumentException e) {

            // Handle error (like invalid array)
            System.out.println(e.getMessage());
        }
    }
}
