public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(7, 12);
        calcFeetAndInchesToCentimeters(7, 13);
        calcFeetAndInchesToCentimeters(-10, 11);
        calcFeetAndInchesToCentimeters(10, 4);

        double centimeters = calcFeetAndInchesToCentimeters(4, 11);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(-10);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet and inches entered.");
            return -1;
        } else {
            double centimeters = ((feet * 12) * 2.54) + (inches * 2.54);
            System.out.println(feet + "ft, " + inches + "in = " + centimeters + "cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0){
            System.out.println("Invalid inches entered");
            return -1;
        } else {
            double feet = (int) inches / 12; //
            double remainingInches = (int) inches % 12;
            System.out.println(inches + "in is equal to " + feet + "ft and " + remainingInches + "in");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
