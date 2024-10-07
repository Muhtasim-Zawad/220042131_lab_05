public class Square implements Shape{
    private int side;
    private int x, y;


    public Square(int side, int x, int y) {
        this.side = side;
        this.x = x;
        this.y = y;
    }


    @Override
    public double calcArea() {
        return side * side;
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
