public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Rishabh", 500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore(75);
        System.out.println("New score is " + newScore);

        newScore = calculateScore();
        System.out.println("New score is " + newScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
