import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        //Give yourself the ability to talk to Bob (User)...
        Scanner bobscan = new Scanner(System.in);


        //Put Bob's chat in a loop so that you can continue chatting until you're ready to leave...
        do {
            System.out.println("Talk to Bob!: ");
            String bobChat = bobscan.nextLine();

            if (bobChat.endsWith("?")) {
                System.out.println("Sure.");
            } else if (bobChat.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (bobChat.equalsIgnoreCase("")) {
                System.out.println("Fine, be that way!");
            } else if (bobChat.equalsIgnoreCase("Later")) {
                break;
            } else {
                System.out.println("Whatever.");
            }
        } while(true);
    }
}
