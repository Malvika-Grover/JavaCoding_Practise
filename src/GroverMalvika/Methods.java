package GroverMalvika;

public class Methods {

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " Managed to get into position " + position + " On the high score table ");

    }
    public static int calculateHighscorePosition(int score){
        if (score >= 1000){
           return 1;
        }
        else if (score >= 500){
            return 2;
        }
        else if (score >= 100 ){
            return 3;
        }
        else {
            return 4;
        }
    }

    public static void main(String[] args) {
        displayHighScorePosition("Malvika", calculateHighscorePosition(1500));
        displayHighScorePosition("Shubham", calculateHighscorePosition(900));
        displayHighScorePosition("Rohan", calculateHighscorePosition(400));
        displayHighScorePosition("Tanishq", calculateHighscorePosition(50));
    }

}