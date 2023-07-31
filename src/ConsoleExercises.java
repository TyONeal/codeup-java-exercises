import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String valuePi = "The value of pi is approximately";
        double pi = 3.14159;
        System.out.printf("%s %.2f", valuePi, pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: ---> " + userInput + " <---");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String firstInput = scanner.next();
        System.out.println("Enter your second word: ");
        String secondInput = scanner.next();
        System.out.println("Enter your last word: ");
        String lastInput = scanner.next();

        System.out.println("Your first word was: " + firstInput + ". Then you said: " + secondInput + ". And finally: " + lastInput);


    }
}
