public class Rectangle implements Shape {
    private double width, length;
    private int x, y;

    public Rectangle(double width, double length, int x, int y) {
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }


    @Override
    public double calcArea() {
        return width * length;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
