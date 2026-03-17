package Optimized_Program.Tab_2.String_Programs.WordCounter;


public class WordCounterMain {

    public static void main(String[] args) {

        String sentence = "Java programming is very interesting.";

        // Call method
        int count = WordCounter.countWords(sentence);

        // Print result
        System.out.println("Total words: " + count);
    }
}

