import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Guess the number between 1 and 100: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                System.out.println("Sorry, the correct number was " + secretNumber + ".");
            }
        } while (guess != secretNumber);
    }
}
