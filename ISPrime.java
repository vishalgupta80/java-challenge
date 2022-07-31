package Challenge;

public class ISPrime {
    public static void main(String[] args){
        System.out.println(sum(5));
        int i = 5;
        int s = (i+(5-1));
        System.out.println(s);

//        int count = 0;
//        for (int j= 10; j<50; j++){
//            if (isPrime(j)){
//                count++;
//                System.out.println(j);
//                if (count == 3){
//                    System.out.println(" code is exit");
//                    break;
//
//                }
//            }



//        }
//
//    }
//    public static boolean isPrime(int n){
//        if (n == 1) {
//            return false;
//        }
//        for (int i=2; i<n/2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//
//        }
//
//        return true;

    }
    public static int sum(int n){
        if (n<1)return n;
        else return (n+sum(n-1));
    }
}
