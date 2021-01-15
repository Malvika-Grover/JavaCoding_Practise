package GroverMalvika;

/* public class GroverMalvika.SecondsAndMinutesChallenge {
    public static void getDurationString(int minutes, int second) {
        int hours = 0;
        if (minutes < 0 || second < 0 || second < 59) {
            System.out.println("Invalid Value");
        } else if (minutes > 60 || second > 60) {
            hours = minutes / 60;
            minutes = (minutes % 60) + ( second / 60);
            second = second % 60;
            System.out.println(hours + " h " + minutes + " m " + second + " s ");
        }else {
            System.out.println(hours + " h " + minutes + " m " + second + " s ");
        }
    }
        public static void main(String[] args) {
        getDurationString(61,10);
    }
}*/
public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hourString = hours + "h";
        if (hours < 10){
            hourString = "0" + hourString;
        }
        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }
        return hourString + " " + minutesString + " "+ secondsString;

    }


    private static String getDurationString(long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSecond = seconds % 60;
        return getDurationString(minutes, remainingSecond);
}

    public static void main(String[] args) {
        System.out.println(getDurationString(62,59));
        System.out.println(getDurationString(1045));

    }
}