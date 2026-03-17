package Optimized_Program.Tab_2.String_Programs.DublicateCharacters;


import java.util.Set;

public class DuplicateCharactersMain {

    public static void main(String[] args) {

        String str = "programming";

        try {
            // Call method to find duplicates
            Set<Character> result = DuplicateCharacters.findDuplicates(str);

            System.out.println("Duplicate characters are:");

            // Print duplicates
            for (char ch : result) {
                System.out.println(ch);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}