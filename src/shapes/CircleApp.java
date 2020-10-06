package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        boolean again = false;

        do {
            Input radius = new Input();
            //System.out.println("Radius of circle: ");

            double enterRadius = radius.getDouble("Enter Radius for circle: ");
            Circle displayCircle = new Circle(enterRadius);

            double area = displayCircle.getArea();
            double circumference = displayCircle.getCircumference();
            System.out.println("Radius: " + enterRadius);
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);

            again = radius.yesNo("Do you want to continue? (y/n): ");

        } while(again);
        System.out.println("Exiting loop....");
    }
}
