package Labs;

class Shape {
    // Method to calculate area
    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private final int radius;

    // Constructor for Circle
    public Circle(int radius) {
        this.radius = radius;
    }

    // Overriding getArea method
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area = π * r^2
    }
}

// Subclass Square extending Shape
class Square extends Shape {
    private final int length;

    // Constructor for Square
    public Square(int length) {
        this.length = length;
    }

    // Overriding getArea method
    @Override
    public double getArea() {
        return length * length; // Area = length^2
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());

        // Creating a Square object
        Square square = new Square(4);
        System.out.println("Area of Square: " + square.getArea());
    }
}