package Challenge;

public class MethodChallenges {
    public static void main(String[] args){
        int highScorePosition = CalculateHighScorePosition(1500);
        DisplayHighScorePosition("yashu", highScorePosition);

         highScorePosition = CalculateHighScorePosition(900);
        DisplayHighScorePosition("vishal", highScorePosition);

        highScorePosition = CalculateHighScorePosition(900);
        DisplayHighScorePosition("abhi", highScorePosition);

        highScorePosition = CalculateHighScorePosition(400);
        DisplayHighScorePosition("annu", highScorePosition);

        highScorePosition = CalculateHighScorePosition(40);
        DisplayHighScorePosition("anshu", highScorePosition);


    }
    public static void DisplayHighScorePosition(String PlayerName, int highScorePositionTable){
        System.out.println(PlayerName + " Manage to get into position " +
                       highScorePositionTable + " on the highScoreTable");

        }

        public static int CalculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        }else if (playerScore>500 && playerScore <1000){
            return 2;
        } else if (playerScore>100 && playerScore <500) {
            return 3;
        }else {
            return 4;
        }


        }



}
