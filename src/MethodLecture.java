import java.util.Scanner;

public class MethodLecture {
    public static void main(String[] args) {
        }
        public static String returnName() {
            return "Ty O'Neal";
    }
        public static String returnLongerString(String stringOne, String stringTwo) {
            stringOne = "This is first string.";
            stringTwo = "This is the second string";
                if(stringOne.length() > stringTwo.length()) {
                    return stringOne;
                } else return stringTwo;
        }

        public static boolean canBeHalved(double number) {
            Scanner halfScan = new Scanner(System.in);
            System.out.println("Please enter a number:");
            double userResponse = halfScan.nextDouble();
            boolean canHalf;

                if (userResponse % 2 == 0) {
                    canHalf = true;
                }
                return true;
        }

}
