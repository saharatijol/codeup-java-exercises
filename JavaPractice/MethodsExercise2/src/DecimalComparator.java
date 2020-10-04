public class DecimalComparator {

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result);

        result = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result);

        result = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(result);

        result = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNum, double secondNum) {
        if((int) (firstNum * 1000) == (int) (secondNum * 1000)) {
            return true;
        }
        return false;
    }
}
