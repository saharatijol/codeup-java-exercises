public class TeenNumberChecker {

    public static void main(String[] args) {
        boolean result = hasTeen(9, 99 ,19);
        System.out.println(result);

        result = hasTeen(23, 15 ,42);
        System.out.println(result);

        result = hasTeen(22, 23 ,34);
        System.out.println(result);

        boolean result2 = isTeen(9);
        System.out.println(result2);

        result2 = isTeen(13);
        System.out.println(result2);
    }

    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        if (teen1 >= 13 && teen1 <= 19) {
            return true;
        } else if(teen2 >= 13 && teen2 <= 19) {
            return true;
        } else if(teen3 >= 13 && teen3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int teen4) {
        return (teen4 >= 13 && teen4 <= 19);
    }
}
