package Optimized_Program.Tab_2.Numbers.SwapNumber;

/**
 * Main class to run swap program.
 */
public class SwapNumbersMain {

    public static void main(String[] args) {

        int a = 67;
        int b = 46;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Call swap logic
        int[] result = SwapNumbers.swap(a, b);

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + result[0]);
        System.out.println("b = " + result[1]);
    }
}
