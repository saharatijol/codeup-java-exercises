public class Main {

    public static void main(String[] args) {

        int positionHighScore = calculateHighScorePosition (1500);
        displayHighScorePosition ("Jimmy", positionHighScore);

        positionHighScore = calculateHighScorePosition (900);
        displayHighScorePosition ("Tom", positionHighScore);

        positionHighScore = calculateHighScorePosition (400);
        displayHighScorePosition ("Ruth", positionHighScore);

        positionHighScore = calculateHighScorePosition (50);
        displayHighScorePosition ("Claire", positionHighScore);

    }

    public static void displayHighScorePosition (String playersName, int positionHighScore) {
        System.out.println(playersName + " managed to get into position " + positionHighScore + " on to the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
