package Challenge;

public class BarkingDog {
    public static boolean ShouldWakeUp(boolean IsBarking, int hourOfDay) {
        if (hourOfDay > 8 || hourOfDay < 22) {
            return true;
        } else {
            return false;
        }
    }
}