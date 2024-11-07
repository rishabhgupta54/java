public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        // INVALID_VALUE_MESSAGE = "Hello";
        System.out.println(getDurationString(65, 1));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-3945L));
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String SecondsString = seconds + "s";
        if (seconds < 10) {
            SecondsString = "0" + SecondsString;
        }

        return hourString + " " + minutesString + " " + SecondsString;
    }

    public static String getDurationString(long seconds) {
        if ((seconds < 0)) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = (int) seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
