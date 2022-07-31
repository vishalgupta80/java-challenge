package Challenge;

public class AllFactor {
    public static void main(String[] args){
        allFactor(6);

    }
    public static void allFactor(int number){
        int i = 0;
        int sum = 0;
        if (number<1){
            System.out.println("Invalid Value");
        }
        while (i<number){
            i++;
            System.out.println(i);
//            if (number%i == 0){
//                System.out.println(i);
//                sum += i;
//            }
//
       }
//        System.out.println("sum is " + sum);


    }
}
