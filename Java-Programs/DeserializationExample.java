import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) ois.readObject();
            System.out.println("Deserialization complete. Name: " + student.name + ", Age: " + student.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
