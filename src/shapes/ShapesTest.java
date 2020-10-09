package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Rectangle(5, 4);
        System.out.println("Rectangle: myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("Rectangle: myShape.getArea() = " + myShape.getArea());


        myShape = new Square(5);
        System.out.println("Square: myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("Square: myShape.getArea() = " + myShape.getArea());

    }
}