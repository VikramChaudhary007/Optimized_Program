package Optimized_Program.Tab_2.String_Programs.AnagramChecker;


public class AnagramChecker {

    /**
     * Checks whether two strings are anagrams.
     *
     * Logic:
     * - Count frequency of characters in both strings
     * - If frequencies match → anagram
     *
     * Time Complexity: O(n)
     */
    public static boolean isAnagram(String str1, String str2) {

        // Edge case: null values
        if (str1 == null || str2 == null) {
            return false;
        }

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, cannot be anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Frequency array for characters (ASCII)
        int[] freq = new int[256];

        // Increase count for str1 and decrease for str2
        for (int i = 0; i < str1.length(); i++) {

            // Increment for character in first string
            freq[str1.charAt(i)]++;

            // Decrement for character in second string
            freq[str2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false; // Not anagram
            }
        }

        return true; // Anagram
    }
}