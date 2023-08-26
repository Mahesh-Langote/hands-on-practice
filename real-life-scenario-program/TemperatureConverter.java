import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        double result;

        if (choice == 'C') {
            result = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F is " + result + "°C");
        } else if (choice == 'F') {
            result = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C is " + result + "°F");
        } else {
            System.out.println("Invalid choice. Please enter 'C' or 'F'.");
        }
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
