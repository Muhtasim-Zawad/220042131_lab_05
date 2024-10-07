import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testRectangleAreaCalc01() {
        Shape rectangle = ShapeFactory.createRectangle(4, 5, 6, 7);
        assertEquals(20, rectangle.calcArea());
    }

    @Test
    void testSquareAreaCalculate01() {
        Shape square = ShapeFactory.createSquare(10,5,3);
        assertEquals(100, square.calcArea());
    }

    @Test
    void testCircleAreaCalculate01() {
        Shape circle = ShapeFactory.createCircle(2, 4, 1);
        assertEquals(Math.PI*2*2, circle.calcArea());
    }

    @Test
    void testRectangleAreaCalc02() {
        Shape rectangle = ShapeFactory.createRectangle(1, 2, 3, 4);
        assertEquals(2, rectangle.calcArea());
    }

    @Test
    void testSquareAreaCalculate02() {
        Shape square = ShapeFactory.createSquare(5,6,7);
        assertEquals(25, square.calcArea());
    }

    @Test
    void testCircleAreaCalculate02() {
        Shape circle = ShapeFactory.createCircle(8, 9, 10);
        assertEquals(Math.PI*8*8, circle.calcArea());
    }

    @Test
    void testGetCoordinates() {
        Shape shape = ShapeFactory.createRectangle(1, 2, 3, 4);
        assertEquals(3, shape.getX());
        assertEquals(4, shape.getY());
    }


    @Test
    void testShapeConstructor() {
        Shape shape = ShapeFactory.createRectangle(1, 2, 3, 4);
        assertEquals(3, shape.getX());
        assertEquals(4, shape.getY());
    }

    @Test
    void testShapeComparatorEqualShapes() {
        Shape square1 = new Square(5, 6, 7);
        Shape square2 = new Square(5, 6, 7);
        assertEquals(0, new ShapeComparator().compare(square1, square2));
    }

    @Test
    void testShapeComparatorEqualArea() {
        Shape square = new Square(5, 6, 7);
        Shape rectangle = new Rectangle(1, 2, 3, 4);
        assertEquals(1, new ShapeComparator().compare(square, rectangle));
    }

}