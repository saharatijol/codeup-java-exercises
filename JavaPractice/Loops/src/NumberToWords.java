public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
    }

    public static void numberToWords(int number) {
        int reverse1 = reverse(number);
        int countDigit = getDigitCount(number);
        int countDigitReverse = getDigitCount(reverse1);
        int diff = countDigit - countDigitReverse;

        if (number == 0) {
            System.out.println("Zero");
        }
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        while (reverse1 > 0) {
            int lastDigit = reverse1 % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverse1 /= 10;

        } while (diff > 0) {
            System.out.println("Zero");
            diff--;
        }
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;

        } else if (number < 10) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
