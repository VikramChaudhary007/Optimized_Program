package Optimized_Program.Tab_2.Collections_Programs.Group_Students;


import java.util.*;

// Student class (Model)
class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class GroupStudentsByMarks {

    public static void main(String[] args) {

        // Create list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 85));
        students.add(new Student("Neha", 92));
        students.add(new Student("Amit", 85));
        students.add(new Student("Priya", 92));
        students.add(new Student("Karan", 78));

        // Create HashMap: Key = marks, Value = list of students
        HashMap<Integer, List<Student>> map = new HashMap<>();

        // Loop through each student
        for (Student s : students) {

            // If marks key is not present, create new list
            if (!map.containsKey(s.marks)) {
                map.put(s.marks, new ArrayList<>());
            }

            // Add student to corresponding marks list
            map.get(s.marks).add(s);
        }

        // Print grouped data
        System.out.println("Grouped Students by Marks:");

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {

            System.out.print("Marks: " + entry.getKey() + " -> Students: ");

            // Print only names
            for (Student s : entry.getValue()) {
                System.out.print(s.name + " ");
            }

            System.out.println();
        }
    }
}