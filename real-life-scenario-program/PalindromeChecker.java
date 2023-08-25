import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }

    static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
