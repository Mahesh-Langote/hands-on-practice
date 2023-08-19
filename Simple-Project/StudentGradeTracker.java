import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeTracker {

    private static Map<String, Double[]> studentGrades = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    assignGrade(scanner);
                    break;
                case 3:
                    viewStudentInfo();
                    break;
                case 4:
                    calculateAverage();
                    break;
                case 5:
                    System.out.println("Exiting Student Grade Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Student Grade Tracker Menu =====");
        System.out.println("1. Add Student");
        System.out.println("2. Assign Grade");
        System.out.println("3. View Student Information");
        System.out.println("4. Calculate Average Grade");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        studentGrades.put(studentName, new Double[3]); // Assuming three grades per student
        System.out.println("Student added: " + studentName);
    }

    private static void assignGrade(Scanner scanner) {
        viewStudentInfo();

        if (!studentGrades.isEmpty()) {
            System.out.print("Enter student name to assign grade: ");
            String studentName = scanner.nextLine();

            if (studentGrades.containsKey(studentName)) {
                System.out.print("Enter three grades separated by spaces: ");
                String[] gradesInput = scanner.nextLine().split(" ");

                if (gradesInput.length == 3) {
                    Double[] grades = new Double[3];
                    for (int i = 0; i < 3; i++) {
                        grades[i] = Double.parseDouble(gradesInput[i]);
                    }

                    studentGrades.put(studentName, grades);
                    System.out.println("Grades assigned to " + studentName);
                } else {
                    System.out.println("Invalid number of grades. Please enter three grades.");
                }
            } else {
                System.out.println("Student not found. Please enter a valid student name.");
            }
        }
    }

    private static void viewStudentInfo() {
        System.out.println("\n===== Student Information =====");
        if (studentGrades.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            for (Map.Entry<String, Double[]> entry : studentGrades.entrySet()) {
                System.out.println("Student: " + entry.getKey() + ", Grades: " + formatGrades(entry.getValue()));
            }
        }
    }

    private static void calculateAverage() {
        if (!studentGrades.isEmpty()) {
            for (Map.Entry<String, Double[]> entry : studentGrades.entrySet()) {
                double average = calculateAverage(entry.getValue());
                System.out.println("Student: " + entry.getKey() + ", Average Grade: " + average);
            }
        } else {
            System.out.println("No students in the system.");
        }
    }

    private static String formatGrades(Double[] grades) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Double grade : grades) {
            stringBuilder.append(grade).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private static double calculateAverage(Double[] grades) {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
