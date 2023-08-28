import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        String reversedString = reverseString(originalString);
        System.out.println("The reversed string is: " + reversedString);
    }

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
