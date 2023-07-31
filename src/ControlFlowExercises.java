import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;

//        int x = 0;

//        do {
//            x += 2;
//            System.out.println(x);
//
//        }while (x <= 98);

//        int x = 100;
//
//        do {
//            x -= 5;
//            System.out.println(x);
//
//        } while (x >= -5);



//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//
//        for (int x = 0; x <= 100; x += 2) {
//            System.out.println(x);
//        }

//                long y = 2L;
//                do {
//                    y = y * y;
//                    System.out.println(y);
//
//                }while(y < 1000000);






/////////////fizzbuzz//////////////////////////////

//        for (int x = 1; x <= 100; x++) {
//            if ((x % 3 == 0)&&(x % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (x % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (x % 3 == 0){
//                System.out.println("Fizz");
//            }else System.out.println(x);
//
//
//        }
/////////////////////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a number between 1 and ten: ");
        int numberSelected = scanner.nextInt();
        int x = 1;
        int numberSquared;
        int numberCubed;



            do {
                if (numberSelected >= 1 && numberSelected <= 10) {

                    numberSquared = x * x;
                    numberCubed = x * x * x;


                    System.out.printf("%-10d %d %10d\n", x, numberSquared, numberCubed);
                    x++;
                }
            }
                while (x <= numberSelected) ;

//            if(Objects.equals(continueResponse, "yes")){
//                do {
//                    numberSquared = numberSelected * numberSelected;
//                    numberCubed = numberSelected * numberSelected * numberSelected;
//
//                    System.out.printf("%-10d %d %10d\n", numberSelected, numberSquared, numberCubed);
//                    numberSelected++;
//                }while(numberSelected >= x && numberSelected <= 50);
//            }

               System.out.println("Would you like to continue?: ");
               String continueResponse = scanner.next();

           while (!Objects.equals(continueResponse, "yes") && !Objects.equals(continueResponse, "no")) {

               System.out.println("please enter a valid answer.");
               System.out.println("Would you like to continue?: ");
               continueResponse= scanner.next();
               if(continueResponse.equals("yes")) {
                break;
               } else if (continueResponse.equals("no")) {
                   continue;
               }

        }
        System.out.println("Please enter a grade between 1 and 100: ");
           int gradeInput = scanner.nextInt();

               if (gradeInput <= 100 && gradeInput >= 98) {
                   System.out.println("You got an A+!");
               }
               else if (gradeInput <= 97 && gradeInput >94) {
                    System.out.println("You got an A!");
                }
                else if (gradeInput <= 94 && gradeInput >= 90) {
                    System.out.println("You got an A-!");
                }

                else if (gradeInput < 90 && gradeInput >= 88) {
                    System.out.println("You got an B+!");
                }
                else if (gradeInput < 87 && gradeInput >84) {
                    System.out.println("You got an B!");
                }
                else if (gradeInput <= 84 && gradeInput >= 80) {
                    System.out.println("You got an B-!");
                }

                else if (gradeInput < 80 && gradeInput >= 78) {
                    System.out.println("You got an C+!");
                }
                else if (gradeInput < 77 && gradeInput >74) {
                    System.out.println("You got an C!");
                }
                else if (gradeInput <= 74 && gradeInput >= 70) {
                    System.out.println("You got an C-!");
                }

               else if (gradeInput < 70 && gradeInput >= 68) {
                   System.out.println("You got an D+!");
               }
               else if (gradeInput < 67 && gradeInput >64) {
                   System.out.println("You got an D!");
               }
               else if (gradeInput <= 64 && gradeInput >= 60) {
                   System.out.println("You got an D-!");
               }

               else if (gradeInput < 60) {
                   System.out.println("You got an F!");
               }



        }
    }

