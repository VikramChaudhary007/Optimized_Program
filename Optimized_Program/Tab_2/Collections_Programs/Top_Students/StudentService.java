package Optimized_Program.Tab_2.Collections_Programs.Top_Students;


import java.util.*;

/**
 * Service class containing business logic
 */
public class StudentService {

    /**
     * Returns top N students based on marks
     *
     * @param students list of students
     * @param n number of top students required
     * @return list of top students
     */
    public static List<Student> getTopStudents(List<Student> students, int n) {

        // Edge case handling
        if (students == null || students.isEmpty()) {
            return new ArrayList<>();
        }

        // Sort in descending order (safe comparator)
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        // Limit to top N
        return students.subList(0, Math.min(n, students.size()));
    }
}