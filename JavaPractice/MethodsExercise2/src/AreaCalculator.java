public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-5.0, -4.0));
    }

    public static double area (double radius) {
        if (radius < 0) {
            System.out.println("Not a valid number");
            return -1;
        }
        return ((Math.PI)*(radius*radius));
    }

    public static double area (double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid number");
            return -1;
        }
        return length * width;
    }
}
