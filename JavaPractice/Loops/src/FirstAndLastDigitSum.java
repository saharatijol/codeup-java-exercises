public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
//        System.out.println(257 / 100 );
//        System.out.println(257 % 10);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int firstDigit = number;
            int lastDigit = number % 10;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            return firstDigit + lastDigit;
        }
    }
}
