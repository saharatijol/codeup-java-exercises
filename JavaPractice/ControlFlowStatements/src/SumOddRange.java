public class SumOddRange {

    public static void main(String[] args) {
<<<<<<< HEAD
=======

>>>>>>> 97e5f4e8ff32bcf5912c4e44f81bb994374190cf
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

<<<<<<< HEAD
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
=======
    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 == 1;
    }

    public static int sumOdd (int start, int end) {
>>>>>>> 97e5f4e8ff32bcf5912c4e44f81bb994374190cf
        if (start < 0 || end < 0) {
            return -1;
        } else if (end < start) {
            return -1;
        } else {
            int sum = 0;
            for (int num = start; num <= end; num++) {
<<<<<<< HEAD
            //System.out.println(num + " = " + isOdd(num));
                if(isOdd(num)) {
=======
                if (isOdd(num)) {
>>>>>>> 97e5f4e8ff32bcf5912c4e44f81bb994374190cf
                    sum += num;
                }
            }
            return sum;
        }
    }
}
