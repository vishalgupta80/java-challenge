package Challenge;

public class gcd {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(10,15));

    }
    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second <10){
            return -1;
        }
        int gdc = 1;
        for (int i = 1; i<=first && i<=second; i++){
            System.out.println(i);
            if (first%i == 0 && second%i == 0){
                gdc = i;
            }

        }
        return gdc;
    }
}
