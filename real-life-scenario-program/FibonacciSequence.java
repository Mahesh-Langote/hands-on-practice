import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int numTerms = scanner.nextInt();

        int[] fibonacciSequence = generateFibonacci(numTerms);
        System.out.print("The Fibonacci sequence: ");
        for (int term : fibonacciSequence) {
            System.out.print(term + " ");
        }
    }

    static int[] generateFibonacci(int n) {
        int[] sequence = new int[n];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }
}
