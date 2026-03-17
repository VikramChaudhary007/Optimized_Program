package Optimized_Program.Tab_2.String_Programs.RemoveSpaces;


public class RemoveSpacesMain {

    public static void main(String[] args) {

        String str = "Java programming is fun";

        try {
            // Call method
            String result = RemoveSpaces.removeSpaces(str);

            // Print results
            System.out.println("Original String: " + str);
            System.out.println("String without spaces: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
