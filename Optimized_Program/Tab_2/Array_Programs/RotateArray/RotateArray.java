package Optimized_Program.Tab_2.Array_Programs.RotateArray;


public class RotateArray {

    /**
     * Rotates array to the left by k positions using reversal algorithm.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void rotateLeft(int[] arr, int k) {

        // Edge case: null or insufficient elements
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }

        int n = arr.length;

        // Normalize k (handles k > n)
        k = k % n;

        // If k is 0, no rotation needed
        if (k == 0) {
            return;
        }

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);
    }

    /**
     * Reverses elements of array from start to end index.
     */
    private static void reverse(int[] arr, int start, int end) {

        // Swap elements until pointers meet
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
