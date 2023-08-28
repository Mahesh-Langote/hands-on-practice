import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);
        System.out.println("The number of words in the sentence is: " + wordCount);
    }

    static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
