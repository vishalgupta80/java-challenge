package Challenge;

public class sumFirstandLastDigit {
    public static void main(String[] args){
        System.out.println(sumFirstlastdigit(0));


    }
    public static int sumFirstlastdigit(int number){
        if (number<0){
            return -1;
        }else {
            int sum = 0;
            int lastDigit = number%10;
            int firstNumber = 0;
            //int temp = number;
            while (number !=0){
                 firstNumber = number%10;
                number /=10;
            }
            return firstNumber + lastDigit;
        }
    }
}
