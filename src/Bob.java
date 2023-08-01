import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner bobscan = new Scanner(System.in);

        do {
            System.out.println("Talk to Bob!: ");
            String bobChat = bobscan.nextLine();

            if (bobChat.endsWith("?")) {
                System.out.println("Sure.");
            } else if (bobChat.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (bobChat.equals("")) {
                System.out.println("Fine, be that way!");
            } else if (bobChat.equals("Later")) {
                break;
            } else {
                System.out.println("Whatever.");
            }
        }while(true);






    }
}
