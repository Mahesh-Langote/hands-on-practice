import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rateOfInterest = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double timePeriod = scanner.nextDouble();

        double interest = calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);
        System.out.println("The simple interest is: " + interest);
    }

    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
