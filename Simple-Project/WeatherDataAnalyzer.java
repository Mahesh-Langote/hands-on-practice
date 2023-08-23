import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeatherDataAnalyzer {

    private static List<Double> temperatureData = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTemperature(scanner);
                    break;
                case 2:
                    viewTemperatureData();
                    break;
                case 3:
                    calculateAverageTemperature();
                    break;
                case 4:
                    findMaxMinTemperature();
                    break;
                case 5:
                    System.out.println("Exiting Weather Data Analyzer. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Weather Data Analyzer Menu =====");
        System.out.println("1. Add Temperature");
        System.out.println("2. View Temperature Data");
        System.out.println("3. Calculate Average Temperature");
        System.out.println("4. Find Max and Min Temperature");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTemperature(Scanner scanner) {
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        temperatureData.add(temperature);
        System.out.println("Temperature added successfully.");
    }

    private static void viewTemperatureData() {
        System.out.println("\n===== Temperature Data =====");
        if (!temperatureData.isEmpty()) {
            for (int i = 0; i < temperatureData.size(); i++) {
                System.out.println("Reading " + (i + 1) + ": " + temperatureData.get(i));
            }
        } else {
            System.out.println("No temperature data available.");
        }
    }

    private static void calculateAverageTemperature() {
        if (!temperatureData.isEmpty()) {
            double sum = 0;
            for (Double temperature : temperatureData) {
                sum += temperature;
            }
            double average = sum / temperatureData.size();
            System.out.println("Average Temperature: " + average);
        } else {
            System.out.println("No temperature data available.");
        }
    }

    private static void findMaxMinTemperature() {
        if (!temperatureData.isEmpty()) {
            double maxTemperature = Double.MIN_VALUE;
            double minTemperature = Double.MAX_VALUE;

            for (Double temperature : temperatureData) {
                if (temperature > maxTemperature) {
                    maxTemperature = temperature;
                }
                if (temperature < minTemperature) {
                    minTemperature = temperature;
                }
            }

            System.out.println("Max Temperature: " + maxTemperature);
            System.out.println("Min Temperature: " + minTemperature);
        } else {
            System.out.println("No temperature data available.");
        }
    }
}
