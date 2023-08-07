public class ThrowThrowsExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older.");
        } else {
            System.out.println("Valid age");
        }
    }
}
