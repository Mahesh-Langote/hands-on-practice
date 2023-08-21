import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeePayrollSystem {

    private static Map<String, Double> employeeSalaries = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    calculateSalary();
                    break;
                case 3:
                    viewEmployeeInfo();
                    break;
                case 4:
                    System.out.println("Exiting Employee Payroll System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Employee Payroll System Menu =====");
        System.out.println("1. Add Employee");
        System.out.println("2. Calculate Monthly Salary");
        System.out.println("3. View Employee Information");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee ID: ");
        String employeeID = scanner.nextLine();

        if (!employeeSalaries.containsKey(employeeID)) {
            System.out.print("Enter monthly salary: ");
            double monthlySalary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            employeeSalaries.put(employeeID, monthlySalary);
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee with ID " + employeeID + " already exists.");
        }
    }

    private static void calculateSalary() {
        if (!employeeSalaries.isEmpty()) {
            System.out.print("Enter employee ID: ");
            Scanner scanner = new Scanner(System.in);
            String employeeID = scanner.nextLine();

            if (employeeSalaries.containsKey(employeeID)) {
                double monthlySalary = employeeSalaries.get(employeeID);
                System.out.println("Monthly salary for employee ID " + employeeID + ": " + monthlySalary);
            } else {
                System.out.println("Employee with ID " + employeeID + " not found.");
            }
        } else {
            System.out.println("No employees in the system.");
        }
    }

    private static void viewEmployeeInfo() {
        System.out.println("\n===== Employee Information =====");
        if (!employeeSalaries.isEmpty()) {
            for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
                System.out.println("Employee ID: " + entry.getKey() + ", Monthly Salary: " + entry.getValue());
            }
        } else {
            System.out.println("No employees in the system.");
        }
    }
}
