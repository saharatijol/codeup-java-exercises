package shapes;

public class Square extends Rectangle {
    private double side;
    // Constructor
    public Square (double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        return 4 * this.side;
    }

    public double getPerimeter() {
        return this.side * this.side;
    }
}
