import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (rock/paper/scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();
        String computerChoice = choices[random.nextInt(choices.length)];

        System.out.println("Computer's choice: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
