package Challenge;

import java.nio.file.LinkOption;

public class MinutesToYear {
    public static  void main(String[] args){
        printYearAndDays(561600);


    }
    public static void printYearAndDays(long minutes){
        long minutesToYear = minutes/525600L;
        long minutesRemaining = minutes-(minutesToYear*525600);
        long days = minutesRemaining/1440;
        System.out.println(minutes + " min " + " = " + minutesToYear + " y " + " and " + days + " d");
    }
}
