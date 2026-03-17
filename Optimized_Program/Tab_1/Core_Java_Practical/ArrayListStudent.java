package Optimized_Program.Tab_1.Core_Java_Practical;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudent {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Create ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // -------------------------------
        // Take input from user
        // -------------------------------
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter student names:");

        // Loop to take student names
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine(); // store original name
            students.add(name);
        }

        // -------------------------------
        // Display all student names
        // -------------------------------
        System.out.println("\nStudent Names:");
        for (String name : students) {
            System.out.println(name);
        }

        // -------------------------------
        // Search student name (Case-Insensitive)
        // -------------------------------
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false; // flag to track result

        // Loop to compare names ignoring case
        for (String name : students) {
            if (name.equalsIgnoreCase(searchName)) {
                found = true;
                break; // stop loop once found
            }
        }

        // Display result
        if (found) {
            System.out.println("Student Found.");
        } else {
            System.out.println("Student Not Found....!");
        }

        // Close scanner to prevent resource leak
        sc.close();
    }
}