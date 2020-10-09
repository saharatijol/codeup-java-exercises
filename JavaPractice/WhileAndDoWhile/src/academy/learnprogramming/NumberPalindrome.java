package academy.learnprogramming;

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
        boolean palindrome = false;
        int reversed = 0;
        int testNumber = number;

        while (testNumber != 0) {
            int digit = testNumber % 10;
            reversed = reversed * 10 + digit;
            testNumber /= 10;
        }
        if (number == reversed) {
            palindrome = true;
        }
        return palindrome;
    }
}