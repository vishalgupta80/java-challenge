package Challenge;

public class teenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3){
       if ((age1>=13 || age1<=19) || (age2>=13 || age2 <=19) ||(age3>=13 || age3 <=19)){
           return true;
       }else {
           return false;
       }

    }
    public static boolean IsTeen(int age){
        if ((age>=13 || age<=19)){
            return true;
        }else {
            return false;
        }
    }


}
