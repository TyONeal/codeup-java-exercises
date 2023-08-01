import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlLoopBonus {

public static void game() {
    Scanner gameScan = new Scanner(System.in);

        String playerOne = "1st Player";
        String playerTwo = "2nd Player";
        String playerThree = "3rd Player";
        String playerFour = "4th Player";
        String playerOneGuess;
        String playerTwoGuess;
        String playerThreeGuess;
        String playerFourGuess;

        String[] players = {playerOne, playerTwo, playerThree, playerFour};
        String[] guessArray;

        System.out.println("Please enter a word:");
        String wordChosen = gameScan.next().toLowerCase();


        for(int i = 0; i < 15; i++) {
            System.out.println(" ");
        }

        for(int i = 1; i < players.length; i++) {
//                if (i == i(1 * 4)) {
//                    System.out.println("It's " + playerOne + "'s turn!");
            for(int turn = 1; turn <= players.length; turn++) {
                if(turn == 1) {
                    System.out.println("It's player one's turn!");
                    System.out.println("Guess a letter!");
                     playerOneGuess = String.valueOf(gameScan.next().charAt(0));
                     if (wordChosen.contains(playerOneGuess)) {
                         System.out.println("Yes, that's correct!");
                     } else {
                         System.out.println("Sorry, that's not correct. Try again next turn!");
                     }

                }else if(turn == 2) {
                    System.out.println("It's player two's turn!");
                    playerTwoGuess = String.valueOf(gameScan.next().charAt(0));
                    if (wordChosen.contains(playerTwoGuess)) {
                        System.out.println("Yes, that's correct!");
                    } else {
                        System.out.println("Sorry, that's not correct. Try again next turn!");
                    }

                } else if (turn == 3) {
                    System.out.println("It's player three's turn!");
                    playerThreeGuess = String.valueOf(gameScan.next().charAt(0));
                    if (wordChosen.contains(playerThreeGuess)) {
                        System.out.println("Yes, that's correct!");
                    } else {
                        System.out.println("Sorry, that's not correct. Try again next turn!");
                    }

                } else {
                    System.out.println("It's player four's turn!");
                    playerFourGuess = String.valueOf(gameScan.next().charAt(0));
                    if (wordChosen.contains(playerFourGuess)) {
                        System.out.println("Yes, that's correct!");
                    } else {
                        System.out.println("Sorry, that's not correct. Try again next turn!");
                    }
                }
            }
        }
}
    public static void main(String[] args) {

        Scanner scanAI = new Scanner(System.in);


//        System.out.println("Hi there, how are you?");
//        String firstResponse = scanAI.next();
//            if(firstResponse.equalsIgnoreCase("good")) {
//                System.out.println("That's wonderful! Is it because you're in class?");
//                String secondGoodResponse = scanAI.next();
//                if (secondGoodResponse.equalsIgnoreCase("yes")) {
//                    System.out.println("Of course it is! Class is great!");
//                } else if (secondGoodResponse.equalsIgnoreCase("no")) {
//                    System.out.println("Well of course not, class sucks...");
//                }
//            } else if(firstResponse.equalsIgnoreCase("bad")) {
//                System.out.println("That's terrible, is it because you have homework?");
//                String secondBadResponse = scanAI.next();
//                if (secondBadResponse.equals("yes")) {
//                    System.out.println("Yeah, that honestly makes a lot of sense.");
//                } else if (secondBadResponse.equals("no")) {
//                    System.out.println("Guess your day is just sucky. Bummer.");
//                }
//            }
;  game();  }
}

