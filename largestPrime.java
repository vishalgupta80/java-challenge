package Challenge;

public class largestPrime {
    public static void main(String[] args){
        prime(31);

    }
    public static int prime(int n){
        int i;
        if (n <=0){
            return -1;
        }else {
            for ( i=2; i<=n; i++){
                if (n%i == 0){
                    n/=i;
                    i--;

                }
            }
            return i;


        }
    }
}
