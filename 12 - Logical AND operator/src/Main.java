public class Main {
    public static void main(String[] args) {
        int topScore = 100;

        if(topScore == 100) {
            System.out.println("You got the high score!");
        }

        if(topScore != 100) {
            System.out.println("Top score not equal to 100");
        }

        if(topScore > 100) {
            System.out.println("Top score greater than 100");
        }

        if(topScore >= 100) {
            System.out.println("Top score greater than or equal 100");
        }

        if(topScore < 100) {
            System.out.println("Top score less than 100");
        }

        if(topScore <= 100) {
            System.out.println("Top score less than or equal 100");
        }

        topScore = 80;
        int secondTopScore = 60;

        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
