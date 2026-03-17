package Optimized_Program.Tab_2.String_Programs.LongestWordFinder;


public class LongestWordFinder {

    /**
     * Finds the longest word in a sentence.
     *
     * Logic:
     * - Remove punctuation
     * - Split sentence into words
     * - Compare lengths
     *
     * @param sentence input sentence
     * @return longest word
     */
    public static String findLongestWord(String sentence) {

        // Edge case: null or empty input
        if (sentence == null || sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("Sentence cannot be empty");
        }

        // Remove punctuation (.,!? etc.)
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // Variable to store longest word
        String longestWord = "";

        // Traverse each word
        for (String word : words) {

            // Compare word lengths
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}