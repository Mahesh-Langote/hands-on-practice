public class OverloadingExample {
    public static void main(String[] args) {
        int sum1 = add(2, 3);
        double sum2 = add(2.5, 3.5);

        System.out.println("Sum (int): " + sum1);
        System.out.println("Sum (double): " + sum2);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
