import java.util.Scanner;

public class MethodsExercises {



//Arithmetic methods:

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int multiplication(int num1, int num2) {
        int resultTotal = 0;
        for (int i = 0; i < num1; i++) {
            resultTotal += num2;
        }
        return resultTotal;
    }

    public static int recursionMulti(int num1, int num2) {
        if ((num1 == 0) || (num2 == 0)) {
            return 0;
        } else {
                return (num1 + recursionMulti(num1, num2 - 1));
            }
        }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//End of Arithmetic methods...

//Bonus 2

    public static int getInteger(int min, int max) {
       Scanner scan = new Scanner(System.in);

       do {
           System.out.println("Enter a number between 1 and 20: ");
           int selection = scan.nextInt();

           if (selection == 4) {
               return 4;
           }
       } while (true);
    }





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println(addition(4, 4));
        System.out.println(subtraction(9, 3));
        System.out.println(division(9, 3));
        System.out.println(multiplication(5, 5));
        System.out.println(modulus(4, 16));
        System.out.println(recursionMulti(4, 4));
        System.out.println(getInteger(1, 20));

        //System.out.println(division(5, 0)); <---- Doesn't work. Gives us a runtime error as expected...

        System.out.println("Enter a number between 1 and 20: ");
        scan.nextInt();

    }
}
