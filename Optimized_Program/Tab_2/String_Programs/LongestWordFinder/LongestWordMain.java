package Optimized_Program.Tab_2.String_Programs.LongestWordFinder;


public class LongestWordMain {

    public static void main(String[] args) {

        String sentence = "Java programming is very powerful.";

        try {
            // Call method
            String result = LongestWordFinder.findLongestWord(sentence);

            // Print result
            System.out.println("Longest word: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
