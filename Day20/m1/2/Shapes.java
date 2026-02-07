// Parent class
class Shape {
    void area() {
        System.out.println("Area formula depends on shape");
    }
}

// Child class 1
class Rectangle extends Shape {
    void area() {
        int l = 5, b = 4;
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

// Child class 2
class Circle extends Shape {
    void area() {
        int r = 3;
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle();
        s.area();

        s = new Circle();
        s.area();
    }
}
