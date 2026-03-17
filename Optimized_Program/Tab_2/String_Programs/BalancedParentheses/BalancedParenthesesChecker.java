package Optimized_Program.Tab_2.String_Programs.BalancedParentheses;


import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesesChecker {

    /**
     * Checks whether parentheses in a string are balanced.
     *
     * Logic:
     * - Push opening brackets into stack
     * - On closing bracket, check top element
     * - If mismatch or stack empty → not balanced
     *
     * Time Complexity: O(n)
     */
    public static boolean isBalanced(String str) {

        // Edge case: null input
        if (str == null) {
            return false;
        }

        // Use Deque instead of Stack (recommended)
        Deque<Character> stack = new ArrayDeque<>();

        // Traverse each character
        for (char ch : str.toCharArray()) {

            // If opening bracket → push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack is empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop top element
                char top = stack.pop();

                // Check for matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty → balanced
        return stack.isEmpty();
    }
}