package Optimized_Program.Tab_2.Collections_Programs.Sort_Employee;


import java.util.*;

/**
 * Service class for employee-related operations
 */
public class EmployeeService {

    /**
     * Sort employees by salary (descending)
     *
     * @param employees list of employees
     * @return sorted list
     */
    public static List<Employee> sortBySalaryDesc(List<Employee> employees) {

        // Edge case handling
        if (employees == null || employees.isEmpty()) {
            return new ArrayList<>();
        }

        // Create a copy to avoid modifying original list
        List<Employee> sortedList = new ArrayList<>(employees);

        // Sort using safe comparator
        sortedList.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        return sortedList;
    }
}
