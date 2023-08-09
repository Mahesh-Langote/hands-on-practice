import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("India");

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
