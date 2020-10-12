public class SharedDigit {

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

