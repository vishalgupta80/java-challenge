package Challenge;

public class MinutesHour {
    public static void main(String[] args){
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
    private static String getDurationString(long minutes, long seconds){
        if ((minutes<0) || (seconds<0 || seconds >59)){
            return "invalid Value";
        }else {
            long hoursInMinutes = minutes/60;
            long remainder = minutes%60;
            //System.out.println(hoursInMinutes + " h " + minutes + " m " + seconds + " s");
            return hoursInMinutes + "h " + remainder + "m " + seconds + "s";
        }

        }

        // overloaded method....
    private static String getDurationString(long seconds){
         if (seconds < 0){
             return "invalid value";
         }
         long minutes = seconds/60;
         long remainingSeconds = seconds%60;
         return getDurationString(minutes, remainingSeconds);
    }
}
