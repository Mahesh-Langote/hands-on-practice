import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FileExplorerConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a directory path (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting File Explorer. Goodbye!");
                break;
            }

            Path directoryPath = Paths.get(input);

            if (Files.exists(directoryPath) && Files.isDirectory(directoryPath)) {
                try {
                    listFilesAndDirectories(directoryPath);
                } catch (IOException e) {
                    System.out.println("Error reading directory: " + e.getMessage());
                }
            } else {
                System.out.println("Invalid directory path. Please try again.");
            }
        }

        scanner.close();
    }

    private static void listFilesAndDirectories(Path directory) throws IOException {
        System.out.println("\n===== Files and Directories in " + directory + " =====");

        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("File: " + file.getFileName());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                if (!directory.equals(dir)) {
                    System.out.println("Directory: " + dir.getFileName());
                }
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("=========================================");
    }
}
