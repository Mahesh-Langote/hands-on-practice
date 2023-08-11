import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");

        fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .forEach(System.out::println);
    }
}
