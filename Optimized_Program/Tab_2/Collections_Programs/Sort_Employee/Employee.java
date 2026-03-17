package Optimized_Program.Tab_2.Collections_Programs.Sort_Employee;


/**
 * Model class representing an Employee
 */
public class Employee {

    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // toString for clean output
    @Override
    public String toString() {
        return name + " - " + salary;
    }
}