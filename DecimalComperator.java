package Challenge;

public class DecimalComperator {
    public static boolean areEqualThreeDecimalPlace(double one, double two){

        if ((int)one*1000 == (int)two*1000){
            return true;
        }else {
            return false;
        }
    }

}
