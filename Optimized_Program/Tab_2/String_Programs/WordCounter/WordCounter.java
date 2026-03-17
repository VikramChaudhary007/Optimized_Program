package Optimized_Program.Tab_2.String_Programs.WordCounter;


public class WordCounter {

    /**
     * Counts number of words in a sentence.
     *
     * Logic:
     * - Remove extra spaces and punctuation
     * - Split using regex "\\s+" (handles multiple spaces)
     *
     * @param sentence input string
     * @return number of words
     */
    public static int countWords(String sentence) {

        // Edge case: null or empty string
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        // Remove punctuation (optional but better)
        sentence = sentence.replaceAll("[^a-zA-Z0-9 ]", "");

        // Split by one or more spaces
        String[] words = sentence.trim().split("\\s+");

        // Return count
        return words.length;
    }
}
