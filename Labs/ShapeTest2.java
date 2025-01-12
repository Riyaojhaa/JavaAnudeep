package Labs;
// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Subclass Circle inheriting from Shape
class Circle extends Shape {
    private final double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area = π * r^2
    }
}

// Subclass Rectangle inheriting from Shape
class Rectangle extends Shape {
    private final double length;
    private final double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    public double calculateArea() {
        return length * width; // Area = length * width
    }
}

public class ShapeTest2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Circle with radius 5
        System.out.println("Area of Circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6); // Rectangle with length 4 and width 6
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
