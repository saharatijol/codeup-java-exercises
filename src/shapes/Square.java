package shapes;

public class Square extends Quadrilateral {
    protected double length;
    protected double width;

    public Square(double side) {
        super(side, side);
//        this.length = side;
//        this.width = side;
    }

 // Setters
//    public void setSide(double side) {
//        this.length = side;
//        this.width = side;
//    }


    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
