import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {
        int areaComparison = Double.compare(s1.calcArea(), s2.calcArea());
        if (areaComparison != 0) {
            return areaComparison;
        }

        int xComparison = Integer.compare(s1.getX(), s2.getX());
        if (xComparison != 0) {
            return xComparison;
        }

        int yComparison = Integer.compare(s1.getY(), s2.getY());
        if (yComparison != 0) {
            return yComparison * -1;
        } else {
            return yComparison;
        }
    }

}
