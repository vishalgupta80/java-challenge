package Challenge;

public class palindromeNumber {
    public static void main(String[] args){
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        int temp = number;
        if (number <0) {
            while (temp != 0) {
                int lastDigit = temp % 10;
                reverseNumber = (reverseNumber * 10) + lastDigit;
                temp /= 10;
            }
        }else {
            number = number*(-1);
             reverseNumber = 0;
             temp = number;

            while (temp != 0) {


                int lastDigit = temp % 10;
                reverseNumber = (reverseNumber * 10) + lastDigit;
                temp /= 10;
            }

        }
        if (reverseNumber == number){
            return true;
        }else {
            return false;
        }

    }
}
