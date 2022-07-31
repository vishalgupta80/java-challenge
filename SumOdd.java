package Challenge;

public class SumOdd {
    public static void main(String[] args){
        System.out.println(SumOdd(-1,100));

    }
    public static boolean isOdd(int number){
        if (number<0 ){
            return false;
        }else {
            if (number %2 != 0){
                return true;
            }else {
                return false;
            }
        }
    }
    public static int SumOdd(int start, int end){
        int sum = 0;
        if ((end<start || end<0) || start<0 ){
            return -1;
        }else {

            for (int i = start; i<=end; i++){
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }


    }
}
