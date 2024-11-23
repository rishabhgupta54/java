import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (userInput < 10) {
            System.out.println("Enter number #" + (userInput + 1));
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                userInput++;
            } else {
                System.out.println("Enter valid number #" + (userInput + 1));
                scanner.nextLine();
            }
        }

        scanner.close();
        System.out.println("Sum: " + sum);
    }
}
