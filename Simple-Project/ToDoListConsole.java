import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListConsole {

    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewList();
                    break;
                case 3:
                    markAsCompleted(scanner);
                    break;
                case 4:
                    removeTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting ToDo List. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== ToDo List Menu =====");
        System.out.println("1. Add Task");
        System.out.println("2. View ToDo List");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Remove Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }

    private static void viewList() {
        System.out.println("\n===== ToDo List =====");
        if (toDoList.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    private static void markAsCompleted(Scanner scanner) {
        viewList();
        if (!toDoList.isEmpty()) {
            System.out.print("Enter the task number to mark as completed: ");
            int taskNumber = scanner.nextInt();
            if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
                String completedTask = toDoList.remove(taskNumber - 1);
                System.out.println("Task marked as completed: " + completedTask);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        viewList();
        if (!toDoList.isEmpty()) {
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();
            if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
                String removedTask = toDoList.remove(taskNumber - 1);
                System.out.println("Task removed: " + removedTask);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }
}
