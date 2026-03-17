package Optimized_Program.Tab_2.Collections_Programs.Sort_Employee;


import java.util.*;

public class SortEmployeesMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new Employee("Rahul", 50000));
        employees.add(new Employee("Neha", 75000));
        employees.add(new Employee("Amit", 60000));
        employees.add(new Employee("Priya", 90000));

        // Call service method
        List<Employee> sortedEmployees = EmployeeService.sortBySalaryDesc(employees);

        System.out.println("Employees sorted by salary (descending):");

        // Print result
        for (Employee e : sortedEmployees) {
            System.out.println(e);
        }
    }
}
