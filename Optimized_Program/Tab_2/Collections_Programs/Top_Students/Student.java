package Optimized_Program.Tab_2.Collections_Programs.Top_Students;


/**
 * Model class representing a Student
 */
public class Student {

    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Optional: toString for clean printing
    @Override
    public String toString() {
        return name + " - " + marks;
    }
}
