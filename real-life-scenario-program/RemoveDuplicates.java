import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of the array separated by spaces: ");
        String[] originalArray = scanner.nextLine().split(" ");

        String[] uniqueArray = removeDuplicates(originalArray);
        System.out.println("The array without duplicates: " + Arrays.toString(uniqueArray));
    }

    static String[] removeDuplicates(String[] array) {
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(array));
        return set.toArray(new String[0]);
    }
}
