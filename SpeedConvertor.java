package Challenge;

public class SpeedConvertor {
    public static long toMilesPerHour(double kilometerPerHour){
        if (kilometerPerHour < 0){
            return -1;
        }
       return Math.round(kilometerPerHour/ 1.609);

    }
    public static void printConversion(double kilometerPerHours){
        if (kilometerPerHours < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(kilometerPerHours);
            System.out.println(kilometerPerHours + "km/h " + "=" +
                    milesPerHour + "mi/h");
        }
    }
}
