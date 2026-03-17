package Optimized_Program.Tab_2.String_Programs.DublicateCharacters;


import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {

    /**
     * Finds duplicate characters in a string.
     *
     * @param str input string
     * @return set of duplicate characters
     */
    public static Set<Character> findDuplicates(String str) {

        // Edge case: null or empty string
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String cannot be empty");
        }

        // Set to track visited characters
        Set<Character> seen = new HashSet<>();

        // Set to store duplicate characters
        Set<Character> duplicates = new HashSet<>();

        // Traverse each character in string
        for (char ch : str.toCharArray()) {

            // If character already exists → it's duplicate
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        return duplicates;
    }
}
