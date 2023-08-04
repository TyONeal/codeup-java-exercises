import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println("Try and guess the random number between 1 and 100!");

        for (int i = 1; i <= 10; i++) {

            int playersGuess = scanner.nextInt();
            if (i == 10) {
                System.out.println("You're out of guesses! Good try!");
            }

            if (playersGuess < randomNumber) {
                System.out.println("HIGHER");
                System.out.println("You've guessed " + i + " times!");
            } else if (playersGuess > randomNumber) {
                System.out.println("LOWER");
                System.out.println("You've guessed " + i + " times!");
            } else {
                System.out.println("Good guess!");
                break;
            }
        }
    }


}
