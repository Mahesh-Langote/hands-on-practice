class Car {
    String model;
    int year;

    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        myCar.display();
    }
}
