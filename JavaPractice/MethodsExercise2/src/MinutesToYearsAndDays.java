public class MinutesToYearsAndDays {

    public static void main(String[] args) {
        System.out.println((printYearsAndDays(525600)));
        System.out.println((printYearsAndDays(1051200)));
        System.out.println((printYearsAndDays(561600)));
    }

    public static String printYearsAndDays (long minutes) {
        if (minutes < 0) {
            return "Invalid Value";
        }
        long hours = minutes / 60;
        long remainingHours = minutes % 60;
        long days = hours / 24;
        long remainingDays = hours % 24;
        long years = days / 365;
        long remainingYears = days % 365;

        return minutes + " min = " + years + "y " + "and " + remainingYears + "d";
    }
}
