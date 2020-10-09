package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
//        this.length = side;
//        this.width = side;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }


    @Override
    public void setLength(double side) {
        this.setSide(side);
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

}
