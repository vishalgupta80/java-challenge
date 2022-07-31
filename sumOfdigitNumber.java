package Challenge;

public class sumOfdigitNumber {
    public static void main(String[] args){
        System.out.println("sum of 125 is " + sumOfDigit(125));

    }
    public static int sumOfDigit(int number){
        // using for loop if number less then 10 then they return -1 as
        // a invalid value..|
        int sum = 0;
        if (number <10){
            return -1;
        }
        // if number is greater then 0 than while executed ..|
        while(number > 0){
            int lastDigit = number%10;
            // number%10 give us last digit number and store in the lastDigit variable..
            sum+= lastDigit;
            // lastDigit's value add and store in sum variable

             number/=10;
        }
        return sum;
    }
}
