package Optimized_Program.Tab_2.OOP_Concepts.LibraryManagement;


// Main class (execution starts here)
public class LibraryManagementMain {

    public static void main(String[] args) {

        // Create book object
        Book b1 = new Book(101, "Java Basics", "James Gosling");

        // Create member object
        Member m1 = new Member(1, "Rahul");

        // Display book details
        System.out.println("Book Details:");
        b1.displayBook();

        // Display member details
        System.out.println("\nMember Details:");
        m1.displayMember();

        // Issue book
        System.out.println("\nIssuing Book...");
        b1.issueBook();

        // Return book
        System.out.println("\nReturning Book...");
        b1.returnBook();
    }
}
