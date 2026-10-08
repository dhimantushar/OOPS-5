// Super class: Shape
class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void displayShapeName() {
        System.out.println("Shape: " + name);
    }

    // Default implementation; each child overrides this with its own formula
    double calculateArea() {
        return 0;
    }
}

// Child class: Circle
class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Child class: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Non-public manager class - processes the Shape array, not main
class ShapeManager {
    void displayAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) { // local loop variable
            Shape shape = shapes[i];
            shape.displayShapeName();

            // Identify each child object before calling its area method
            if (shape instanceof Circle) {
                System.out.println("  Type: Circle | Area: " + shape.calculateArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("  Type: Rectangle | Area: " + shape.calculateArea());
            }
        }
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Circle("Circle A", 4),
            new Rectangle("Rectangle B", 5, 3)
        };

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}
