public class DigitSum {

    public static void main(String[] args) {
        System.out.println("Sum of digits in number sumDigits(125) is " + sumDigits(125));
        System.out.println("Sum of digits in number sumDigits(-125) is " + sumDigits(-125));
        System.out.println("Sum of digits in number sumDigits(4) is " + sumDigits(4));
        System.out.println("Sum of digits in number sumDigits(32123) is " + sumDigits(32123));
        System.out.println("Sum of digits in number sumDigits(58763) is " + sumDigits(58763));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        } else {
            int sum;
            for(sum = 0; number > 0; number /= 10) {
                int digit = number % 10;
                sum += digit;
            }

            return sum;
        }
    }
}

