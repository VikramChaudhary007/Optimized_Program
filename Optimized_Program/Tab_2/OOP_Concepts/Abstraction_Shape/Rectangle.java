package Optimized_Program.Tab_2.OOP_Concepts.Abstraction_Shape;


// Rectangle class extends Shape
public class Rectangle extends Shape {

    private int length; // encapsulated variable
    private int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Setters
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Implement abstract method
    @Override
    public void area() {

        // Formula: length × width
        int result = length * width;

        System.out.println("Area of Rectangle: " + result);
    }
}
