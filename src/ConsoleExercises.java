import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String valuePi = "The value of pi is approximately";
        double pi = 3.14159;
        System.out.printf("%s %.2f", valuePi, pi);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: ---> " + userInput + " <---");

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Enter the first word: ");
//        String firstInput = scanner.next();
//        System.out.println("Enter your second word: ");
//        String secondInput = scanner.next();
//        System.out.println("Enter your last word: ");
//        String lastInput = scanner.next();
//        System.out.println("Your first word was: " + firstInput + ". Then you said: " + secondInput + ". And finally: " + lastInput);


        System.out.println("Enter three words: ");
        String firstInput = scanner.next();
        String secondInput = scanner.next();
        String thirdInput = scanner.next();
        System.out.println("The first word is: " + firstInput);
        System.out.println("The second word is: " + secondInput);
        System.out.println("The third word is: " + thirdInput);

        scanner.nextLine();
        System.out.println("Please enter a sentence: ");
        String newSentence = scanner.nextLine();
        System.out.println("The new sentence is: " + newSentence);

        scanner.useDelimiter("\n");

        scanner.nextLine();
        System.out.println("Let's calculate the area of your classroom: ");
        System.out.println("What is the length of your room?: ");
        int lengthResponse = scanner.nextInt();
//        float length = (Float.parseFloat(lengthResponse));
        System.out.println("What is the width of your room?: ");
        int widthResponse = scanner.nextInt();
//        float width = (Float.parseFloat(widthResponse));

        System.out.println(lengthResponse * widthResponse);
        scanner.nextLine();
        System.out.println("Now let's calculate the perimeter of your classroom: ");
        System.out.println((2 * lengthResponse) + (2 * widthResponse));

        scanner.nextLine();
        System.out.println("Finally, let's calculate the volume of your classroom: ");
        System.out.println("What is the height of your room?: ");
        int heightResponse = scanner.nextInt();
//        float height = (Float.parseFloat(heightResponse));
        System.out.println(widthResponse * lengthResponse * heightResponse);







    }
}
