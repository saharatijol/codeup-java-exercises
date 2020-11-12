
public class Floor {
    private double width = 0;
    private double length = 0;

    public Floor (double length, double width) {
        if(length > 0) {
            this.length = length;
        }
        if (width > 0) {
            this.width = width;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }
}


