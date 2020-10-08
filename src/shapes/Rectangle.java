package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    // Constructor
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public double getArea() {
       return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
}
