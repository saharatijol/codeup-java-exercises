public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(707) = " + isPalindrome(707));
        System.out.println("isPalindrome(12212) = " + isPalindrome(11212));
        System.out.println("isPalindrome(121) = " + isPalindrome(121));
        System.out.println("isPalindrome(121) = " + isPalindrome(12321));
        System.out.println("isPalindrome(12321) = " + isPalindrome(1001));
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int remainder;
        int originalNum = number;

        while( number != 0 ) {
            remainder = number % 10;
            reversed = reversedNum * 10 + remainder;
            number /= 10;
        }
        return originalNum == reversedNumber;
    }
}

