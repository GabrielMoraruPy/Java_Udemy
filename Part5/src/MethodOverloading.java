public class MethodOverloading {
    public static void main(String[] args){
        int newScore = calculateScore("tim", 200);
        System.out.println("Player new highscore is " + newScore);

        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(int score){

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(){

        System.out.println("No player name, no score");
        return 0;
    }


}
