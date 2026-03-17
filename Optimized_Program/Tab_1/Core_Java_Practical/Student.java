package Optimized_Program.Tab_1.Core_Java_Practical;


public class Student {

    // -------------------------------
    // Instance Variables (Encapsulation)
    // -------------------------------
    private int id;
    private String name;
    private double marks;

    // -------------------------------
    // Constructor
    // -------------------------------
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // -------------------------------
    // Getter Methods
    // -------------------------------
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // -------------------------------
    // Setter Methods
    // -------------------------------
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // -------------------------------
    // Method to display student details
    // -------------------------------
    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}
