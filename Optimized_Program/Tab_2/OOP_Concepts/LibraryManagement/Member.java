package Optimized_Program.Tab_2.OOP_Concepts.LibraryManagement;


// Member class represents a library member
public class Member {

    int memberId; // unique member ID
    String name;  // member name

    // Constructor to initialize member details
    public Member(int memberId, String name) {
        this.memberId = memberId; // assign ID
        this.name = name;         // assign name
    }

    // Display member details
    public void displayMember() {

        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
    }
}
