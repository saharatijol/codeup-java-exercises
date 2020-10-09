package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        // BOX 1
        Rectangle box1 = new Rectangle (4, 5);
        System.out.println("---- BOX 1 ----");
        System.out.println("getPerimeter() = " + box1.getPerimeter());
        System.out.println("getArea() = " + box1.getArea());

        // BOX 2
        Rectangle box2 = new Square (5);
        System.out.println("---- BOX 2 ----");
        System.out.println("getPerimeter() = " + box2.getPerimeter());
        System.out.println("getArea() = " + box2.getArea());

        // BOX 3 Method Overriding
        Rectangle box3 = new Square(5);
        System.out.println("---- BOX 3 ----");
        System.out.println("getPerimeter() = " + box3.getPerimeter());
        System.out.println("getArea() = " + box3.getArea());

        // BOX 4 Method Overriding : (Test)
        Rectangle box4 = new Rectangle(4, 5);
        System.out.println("---- BOX 4 ----");
        System.out.println("getPerimeter() = " + box4.getPerimeter());
        System.out.println("getArea() = " + box4.getArea());
    }
}
