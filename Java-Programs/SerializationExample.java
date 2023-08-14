import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            Student student = new Student("John", 20);
            oos.writeObject(student);
            System.out.println("Serialization complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
