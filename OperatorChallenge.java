package Challenge;

public class OperatorChallenge {
    public static void main(String[] args){
        // create double variable with the value of 20.00;
        double first = 20.00d;
        double second = 80.00d;

        double result = (first+second)*100.00;
        double remainder = result%40.00d;

        boolean isRemainder = (remainder == 0)?true:false;
        System.out.println(isRemainder);




    }
}
