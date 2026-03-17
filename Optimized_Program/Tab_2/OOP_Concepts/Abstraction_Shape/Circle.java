package Optimized_Program.Tab_2.OOP_Concepts.Abstraction_Shape;


// Circle class extends Shape
public class Circle extends Shape {

    private double radius; // encapsulated variable

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    @Override
    public void area() {

        // Formula: πr²
        double result = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + result);
    }
}