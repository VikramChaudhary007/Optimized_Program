package Optimized_Program.Tab_2.String_Programs.RemoveSpaces;


public class RemoveSpaces {

    /**
     * Removes all whitespace characters from a string.
     *
     * Logic:
     * - Traverse each character
     * - Append only non-space characters using StringBuilder
     *
     * @param str input string
     * @return string without spaces
     */
    public static String removeSpaces(String str) {

        // Edge case: null or empty string
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }

        // StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Traverse each character
        for (char ch : str.toCharArray()) {

            // Check if character is NOT whitespace
            if (!Character.isWhitespace(ch)) {
                result.append(ch); // add character
            }
        }

        // Convert StringBuilder to String
        return result.toString();
    }
}
