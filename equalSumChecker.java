package Challenge;

public class equalSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        int d = a + b;
        if (d == c){
            return true;
        }else {
            return false;
        }
    }
}
