package shapes;

public class Square extends Rectangle {
    private double side; // remove this cause it not needed

    // Constructor
    public Square (double side) {
        super(side, side);
        this.side = side; // remove, not needed
    }

    public double getArea() {
        return 4 * this.side;
        // return 4 * this.width
    }

    public double getPerimeter() {
        return this.side * this.side;
        // return this.length * this.length to take
    }
}
