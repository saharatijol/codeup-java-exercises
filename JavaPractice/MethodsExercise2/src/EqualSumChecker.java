public class EqualSumChecker {

    public static void main(String[] args) {
        boolean result = hasEqualSum(1, 1, 1);
        System.out.println(result);

        result = hasEqualSum(1, 1, 2);
        System.out.println(result);

        result = hasEqualSum(1, -1, 0);
        System.out.println(result);
    }

    public static boolean hasEqualSum(int sum1, int sum2, int sum3) {
        return (sum1 + sum2) == sum3;
    }
}
