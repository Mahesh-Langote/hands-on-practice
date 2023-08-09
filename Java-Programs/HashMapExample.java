import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Charlie", 95);

        System.out.println("Bob's grade: " + grades.get("Bob"));
    }
}
