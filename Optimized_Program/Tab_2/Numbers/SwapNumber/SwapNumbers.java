package Optimized_Program.Tab_2.Numbers.SwapNumber;

/**
 * Utility class to perform number operations.
 */
public class SwapNumbers {

    /**
     * Swaps two numbers using XOR without extra variable.
     * This avoids overflow issues present in (a + b) method.
     *
     * @param a first number
     * @param b second number
     * @return swapped values in array {a, b}
     */
    public static int[] swap(int a, int b) {

        // If both values are same, no need to swap
        if (a == b) {
            return new int[]{a, b};
        }

        // XOR swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[]{a, b};
    }
}
