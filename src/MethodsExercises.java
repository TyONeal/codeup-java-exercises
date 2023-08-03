import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    Random classRandom = new Random();
    int randomNumber = classRandom.nextInt();

//Arithmetic methods:

//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int multiplication(int num1, int num2) {
//        int resultTotal = 0;
//        for (int i = 0; i < num1; i++) {
//            resultTotal += num2;
//        }
//        return resultTotal;
//    }
//
    public static int recursionMulti(int num1, int num2) {
//       classRandom.nextInt(20);
        if ((num1 == 0) || (num2 == 0)) {
            return 0;
        } else {
            return (num1 + recursionMulti(num1, num2 - 1));
        }
    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }

//End of Arithmetic methods...

//Bonus 2

//    public static int getInteger(int min, int max) {
//        Scanner scan = new Scanner(System.in);
//
//        Random secret = new Random();
//        int newSecret = secret.nextInt(max - min + 1) + min;
//        System.out.println(newSecret);
//
//
//        while (true) {
//
//            System.out.println("Enter the correct number between " + min + " and " + max + ": ");
//            int userResponse = scan.nextInt();
//
//            if (userResponse < min || userResponse > max) {
//                System.out.println("Please enter a valid number from " + min + " and " + max);
//                continue;
//            }
//
//            if (userResponse == newSecret) {
//                System.out.println("Yes, that's correct!");
//                break;
//            } else {
//                System.out.println("Sorry, try again!");
//            }
//
//        }
//        return newSecret;
//    }

//Bonus 3

//    public static void getFactorial() {
//        Scanner factScan = new Scanner(System.in);
//        do {
//        System.out.println("Please enter a number between 1 and 20:");
//        long factorial = factScan.nextLong();
//        if (factorial >=1 && factorial <= 20) {
//            for (long i = factorial - 1; i >= 1; i--) {
//                System.out.println(i);
//                factorial = factorial * i;
//
//            }
//        }
//
//        System.out.println(factorial);
//
//        System.out.println("Would you like to continue?");
//        String userContinue = factScan.next();
//        if(userContinue.equalsIgnoreCase("yes")) {
//            System.out.println("ByeBye!");
//            break;
//        }
//        }while(true);
//    }
////
//    public static long getRecursionFactorial(long factorial) {
//            if (factorial <= 1) {
//                return factorial;
//            }
//            return factorial * getRecursionFactorial(factorial - 1);
//    }

//Bonus 4

//    public static void diceGame() {
//        Scanner diceScan = new Scanner(System.in);
//        Random diceRoll = new Random();
//
//        System.out.println("How many sides does your dice have?");
//        int sidedResponse = diceScan.nextInt();
//
//        System.out.println("Type \"roll\" to roll the dice:");
//        String roll = diceScan.next();
//            for (int i = 1; i <= 100000; i++)
//                if(roll.equalsIgnoreCase("roll")) {
//                    int firstDie = diceRoll.nextInt(sidedResponse);
//                    int secondDie = diceRoll.nextInt(sidedResponse);
//                    System.out.println(firstDie + secondDie);
//
//                    System.out.println("Would you like to roll again?");
//                    String continueResponse = diceScan.next();
//                        if (continueResponse.equalsIgnoreCase("no")) {
//                            break;
//                    }
//
//                }
//    }




//Main method

    public static void main(String[] args) {

//    Scanner scan = new Scanner(System.in);

//        System.out.println(addition(4, 4));
//        System.out.println(subtraction(9, 3));
//        System.out.println(division(9, 3));
//        System.out.println(multiplication(5, 5));
//        System.out.println(modulus(4, 16));
//        System.out.println(recursionMulti(4, 4));
//        System.out.println(getInteger(1, 20));
        //System.out.println(division(5, 0)); <---- Doesn't work. Gives us a runtime error as expected...
//        getFactorial();

/////////// For Recursion Factorial ////////////////////////////////////////////////////////////////////////
//        Scanner factScan = new Scanner(System.in);
//
//        System.out.println("Please enter a number between 1 and 20:");
//        long factorial = factScan.nextLong();
//
//        getRecursionFactorial(factorial);
//////////////////////////////////////////////////////////////////////////////////////
//diceGame();
    }
}
