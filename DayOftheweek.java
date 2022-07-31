package Challenge;


public class DayOftheweek {
    public static void main(String[] args){
        System.out.println(printDayOfTheWeek(8));

    }

    public static String printDayOfTheWeek(int day){

        switch (day){
            case 0:
                return "sunday";
            case 1:
                return "monday";
            case 3:
                return "tuesday";
            case 4:
                return "wednesday";

            case 5:
                return "thursday";
            case 6:
                return "friday";
            case 7:
                return "saturday";
            default:
                return "invalid valie";

        }

    }
}
