package Optimized_Program.Tab_2.String_Programs.AnagramChecker;


public class AnagramMain {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Call method
        boolean result = AnagramChecker.isAnagram(str1, str2);

        // Print result
        if (result) {
            System.out.println("Strings are Anagrams.");
        } else {
            System.out.println("Strings are Not Anagrams.");
        }
    }
}
