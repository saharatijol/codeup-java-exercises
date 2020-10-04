public class isLeapYear {

    public static void main(String[] args) {
        boolean result = isLeapYear(-1600);
        System.out.println(result);

        result = isLeapYear(1600);
        System.out.println(result);

        result = isLeapYear(2017);
        System.out.println(result);

        result = isLeapYear(1924);
        System.out.println(result);
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)){
                return true;
            }
        }
        return false;
    }
}
