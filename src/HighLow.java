import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Try and guess the random number between 1 and 100!");
            int playersGuess = scanner.nextInt();
            System.out.println("You've guessed " + i + " times!");
            if (i == 10) {
                System.out.println("You're out of guesses! Good try!");
            }

            if (playersGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (playersGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("Good guess!");
                break;
            }
        }
    }
}
