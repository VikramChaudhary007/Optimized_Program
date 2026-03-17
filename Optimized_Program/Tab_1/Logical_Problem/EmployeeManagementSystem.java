import java.util.ArrayList;
import java.util.Scanner;

// -------------------------------
// Employee Class (Model Class)
// Represents a single employee
// -------------------------------
class Employee {

    // Private variables (Encapsulation)
    private int id;
    private String name;

    // Constructor to initialize employee object
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter method to access employee ID
    public int getId() {
        return id;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}

// -------------------------------
// Main Class (Execution Starts Here)
// -------------------------------
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // ArrayList to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Infinite loop for menu-driven program
        while (true) {

            // -------------------------------
            // Display Menu Options
            // -------------------------------
            System.out.println("\n---- Employee Management System ----");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");

            // Take user choice
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            // Perform action based on user choice
            switch (choice) {

                // -------------------------------
                // Case 1: Add Employee
                // -------------------------------
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer (important)

                    // Check if employee ID already exists
                    boolean exists = false;
                    for (Employee e : employees) {
                        if (e.getId() == id) {
                            exists = true;
                            break;
                        }
                    }

                    // If duplicate ID found, do not add
                    if (exists) {
                        System.out.println("Employee with this ID already exists!");
                        break;
                    }

                    // Take employee name input
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    // Add new employee object to list
                    employees.add(new Employee(id, name));

                    System.out.println("Employee Added Successfully");
                    break;

                // -------------------------------
                // Case 2: View Employees
                // -------------------------------
                case 2:

                    // Check if list is empty
                    if (employees.isEmpty()) {
                        System.out.println("No Employees Found");
                    } else {

                        System.out.println("\nEmployee List:");

                        // Loop through list and display each employee
                        for (Employee e : employees) {
                            e.display();
                        }
                    }
                    break;

                // -------------------------------
                // Case 3: Delete Employee
                // -------------------------------
                case 3:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();

                    // removeIf safely removes matching employee
                    // Returns true if any element was removed
                    boolean removed = employees.removeIf(e -> e.getId() == deleteId);

                    // Display result
                    if (removed) {
                        System.out.println("Employee Deleted");
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                // -------------------------------
                // Case 4: Exit Program
                // -------------------------------
                case 4:
                    System.out.println("Exiting Program...");
                    sc.close(); // close scanner (good practice)
                    return;

                // -------------------------------
                // Default: Invalid Choice
                // -------------------------------
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}