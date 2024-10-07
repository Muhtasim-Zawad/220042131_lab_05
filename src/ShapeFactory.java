public class ShapeFactory {
    public static Shape createCircle(double radius, int x, int y) {
        return new Circle(radius, x, y);
    }

    public static Shape createSquare(double side, int x, int y) {
        return new Square(side, x, y);
    }

    public static Shape createRectangle(double width, double height, int x, int y) {
        return new Rectangle(width, height, x, y);
    }
}
