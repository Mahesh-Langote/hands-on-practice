import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementSystem {

    private static Map<String, Boolean> libraryCatalog = new HashMap<>();
    private static Map<String, String> checkedOutBooks = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    checkOutBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    viewLibraryCatalog();
                    break;
                case 5:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Library Management System Menu =====");
        System.out.println("1. Add Book");
        System.out.println("2. Check Out Book");
        System.out.println("3. Return Book");
        System.out.println("4. View Library Catalog");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        if (!libraryCatalog.containsKey(title)) {
            libraryCatalog.put(title, true); // true indicates the book is available
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Book with title '" + title + "' already exists in the library.");
        }
    }

    private static void checkOutBook(Scanner scanner) {
        viewLibraryCatalog();

        if (!libraryCatalog.isEmpty()) {
            System.out.print("Enter the title of the book to check out: ");
            String title = scanner.nextLine();

            if (libraryCatalog.containsKey(title) && libraryCatalog.get(title)) {
                System.out.print("Enter your name: ");
                String borrowerName = scanner.nextLine();

                checkedOutBooks.put(title, borrowerName);
                libraryCatalog.put(title, false); // set book as checked out
                System.out.println("Book checked out successfully.");
            } else {
                System.out.println("Book not available or does not exist.");
            }
        }
    }

    private static void returnBook(Scanner scanner) {
        if (!checkedOutBooks.isEmpty()) {
            System.out.print("Enter the title of the book to return: ");
            String title = scanner.nextLine();

            if (checkedOutBooks.containsKey(title)) {
                libraryCatalog.put(title, true); // set book as available
                checkedOutBooks.remove(title);
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book not found in the checked-out list.");
            }
        } else {
            System.out.println("No books checked out at the moment.");
        }
    }

    private static void viewLibraryCatalog() {
        System.out.println("\n===== Library Catalog =====");
        if (!libraryCatalog.isEmpty()) {
            for (Map.Entry<String, Boolean> entry : libraryCatalog.entrySet()) {
                System.out.println("Title: " + entry.getKey() + ", Available: " + entry.getValue());
            }
        } else {
            System.out.println("No books in the library catalog.");
        }
    }
}
