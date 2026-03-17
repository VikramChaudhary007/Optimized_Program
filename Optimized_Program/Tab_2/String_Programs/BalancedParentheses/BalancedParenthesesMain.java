package Optimized_Program.Tab_2.String_Programs.BalancedParentheses;


public class BalancedParenthesesMain {

    public static void main(String[] args) {

        String str = "{[()]}";

        // Call method
        boolean result = BalancedParenthesesChecker.isBalanced(str);

        // Print result
        if (result) {
            System.out.println("Parentheses are Balanced");
        } else {
            System.out.println("Parentheses are Not Balanced");
        }
    }
}
