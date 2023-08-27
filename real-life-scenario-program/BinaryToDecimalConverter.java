import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("The decimal equivalent is: " + decimalNumber);
    }
}
