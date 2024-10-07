import java.util.List;

public class OrderPrinter {

    public static void printInOrder(List<Shape> shape) {
        shape.sort(new ShapeComparator());

        for (Shape s : shape) {
            System.out.println("Area of Shape : " + s.calcArea() +
                                ", X : " + s.getX() + ", Y : " + s.getY());
        }
    }
}
