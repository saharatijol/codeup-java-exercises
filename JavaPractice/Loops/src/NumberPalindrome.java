public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(707) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(12212) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(121) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(121) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(12321) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(10011) = " + isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int remainder;

        int originalNumber = number;

        while( number != 0 ) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
