package Challenge;

public class SharedDigit {
    public static void main(String[] args){
        System.out.println(digit(22,  23, 34));

    }
    public static boolean digit(int first, int second, int third) {
        if ((first >= 10 && first <= 1000) && (second >= 10 && second <= 1000)) {
            int firstLastDigit = first % 10;
            int secondLastDigit = second % 10;
            int thirdLastDigit = third%10;
            first /= 10;
            second /= 10;
            third/=10;
            int firstFirstDigit = first;
            int secondFirstDigit = second;
            int thirdFirstDigit = third;
            return ((firstLastDigit == secondLastDigit) || (firstLastDigit == thirdLastDigit) || (secondLastDigit == thirdLastDigit));


            }else {
            return false;
        }
    }
    public static boolean isValid(int number){
        if (number>=10 &&  number <= 1000){
            return true;
        }else {
            return false;
        }
    }
    }

