package Optimized_Program.Tab_2.Collections_Programs.Top_Students;


import java.util.*;

public class TopStudentsMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student("Rahul", 85));
        students.add(new Student("Amit", 92));
        students.add(new Student("Neha", 78));
        students.add(new Student("Priya", 95));
        students.add(new Student("Karan", 88));

        // Get top 3 students
        List<Student> topStudents = StudentService.getTopStudents(students, 3);

        System.out.println("Top 3 Students:");

        // Print result
        for (Student s : topStudents) {
            System.out.println(s);
        }
    }
}
