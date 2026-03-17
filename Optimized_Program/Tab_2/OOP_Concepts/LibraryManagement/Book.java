package Optimized_Program.Tab_2.OOP_Concepts.LibraryManagement;


// Book class represents a book in the library
public class Book {

    int bookId;        // unique ID of the book
    String title;      // title of the book
    String author;     // author name
    boolean isIssued;  // issue status

    // Constructor to initialize book details
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;   // assign book ID
        this.title = title;     // assign title
        this.author = author;   // assign author
        this.isIssued = false;  // default: not issued
    }

    // Method to issue book
    public void issueBook() {

        // Check if book is available
        if (!isIssued) {
            isIssued = true; // mark as issued
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Method to return book
    public void returnBook() {

        // Check if book was issued
        if (isIssued) {
            isIssued = false; // mark as returned
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    // Display book details
    public void displayBook() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
    }
}
