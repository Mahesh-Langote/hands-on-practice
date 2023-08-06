class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw();

        myShape = new Square();
        myShape.draw();
    }
}
