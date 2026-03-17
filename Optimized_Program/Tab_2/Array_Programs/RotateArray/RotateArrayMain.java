package Optimized_Program.Tab_2.Array_Programs.RotateArray;


public class RotateArrayMain {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.print("Original Array: ");
        printArray(arr);

        // Perform rotation
        RotateArray.rotateLeft(arr, k);

        System.out.print("\nRotated Array: ");
        printArray(arr);
    }

    /**
     * Utility method to print array elements
     */
    private static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
