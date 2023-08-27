import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("The binary equivalent is: " + binaryNumber);
    }
}
