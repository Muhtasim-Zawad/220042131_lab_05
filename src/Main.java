import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Adding shapes using the factory
        shapes.add(ShapeFactory.createCircle(5, 2, 3));
        shapes.add(ShapeFactory.createCircle(4, 1, 4));
        shapes.add(ShapeFactory.createSquare(3, 5, 1));
        shapes.add(ShapeFactory.createRectangle(4, 6, 3, 2));
        shapes.add(ShapeFactory.createSquare(2, 6, 5));
        shapes.add(ShapeFactory.createRectangle(5, 3, 4, 6));
        shapes.add(ShapeFactory.createCircle(3, 5, 1));


        // Sorting and printing the shapes
        System.out.println("Sorted Shapes :");
        OrderPrinter.printInOrder(shapes);
    }
}