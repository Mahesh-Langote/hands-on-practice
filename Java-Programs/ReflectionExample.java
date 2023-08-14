import java.lang.reflect.Method;

class MyClass {
    public void display() {
        System.out.println("Reflection Example");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> myClass = Class.forName("MyClass");
            Object obj = myClass.getDeclaredConstructor().newInstance();

            Method method = myClass.getDeclaredMethod("display");
            method.invoke(obj);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
