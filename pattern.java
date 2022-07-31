package Challenge;

public class pattern {
    public static void main(String[] args){
        printStar(5);
    }
    public static void printStar(int number){
        if (number <5){
            System.out.println("invalid");

        }else {
            for (int i = 1; i<=number; i++){
                System.out.print("*");
                System.out.println();
                for (int j = i; j<=number; j++){
                    System.out.println("**  **");


                }
            }
        }

    }
}
