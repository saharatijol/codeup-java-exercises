public class SecondsAndMinutes {
    /*
    * ====== BONUS =====
    * For the input 61 minutes, output should be 01h 01m 00s, but it is ok if it's 1h 1m 0s (Tip: use if-else)
    */

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        } else {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if(hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if(remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = remainingMinutes + "m";
            if(remainingMinutes < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + " " + minutesString + " " + secondsString + " ";
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
