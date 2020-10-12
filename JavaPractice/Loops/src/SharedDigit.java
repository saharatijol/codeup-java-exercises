public class SharedDigit {

    /*
     * Write a method named hasSharedDigit with two parameters of type int
     * Each number should be within range of 10(inclusive) - 99(inclusive).
     * If one of the numbers is not within range, the method should return false
     * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false
     *
     * Example I/O:
     * hasSharedDigit(12, 23); -> true
     * hasSharedDigit(9, 99); -> false, since 9 is not within range of 10-99
     * hasSharedDigit(15, 55); -> true
     *
     * */

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13)); //why?????
        System.out.println(hasSharedDigit(12, 42));
        System.out.println(hasSharedDigit(95, 50));
        System.out.println(hasSharedDigit(91, 19));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        } else {
            int scanNum1;
            int scanNum2;

            while (num1 > 0 || num2 > 0) {
                scanNum1 = num1 % 10;
                scanNum2 = num2 % 10;
                num1 /= 10;
                num2 /= 10;
//            return scanNum1 == scanNum2 || scanNum1 == num2 || scanNum2 == num1;
                if (scanNum1 == scanNum2 || scanNum1 == num2 || scanNum2 == num1) {
                    return true;
                }
            }
        }
        return false;
    }
}

