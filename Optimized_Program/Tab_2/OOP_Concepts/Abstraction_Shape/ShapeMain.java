package Optimized_Program.Tab_2.OOP_Concepts.Abstraction_Shape;


// Main class (execution starts here)
public class ShapeMain {

    public static void main(String[] args) {

        // Create Circle object
        Shape c = new Circle(5);  // polymorphism

        // Create Rectangle object
        Shape r = new Rectangle(10, 5);

        // Call area method
        c.area();
        r.area();
    }
}
