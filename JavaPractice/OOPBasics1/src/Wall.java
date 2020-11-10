
public class Wall {
    private double width;
    private double height;

    public Wall () {
        this(0.0, 0.0);
    }

    public Wall(double width, double height) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }

//    public static void main(String[] args) {
//        Wall aWall = new Wall(5,4);
//        System.out.println("aWall.getArea() = " + aWall.getArea());
//
//        aWall.setHeight(-1.5);
//        System.out.println("aWall.getWidth() = " + aWall.getWidth());
//        System.out.println("aWall.getHeight() = " + aWall.getHeight());
//        System.out.println("aWall.getArea() = " + aWall.getArea());
//    }
}


