package util;
import java.util.Scanner;
public class Input {

    private Scanner inputScan = new Scanner(System.in);

    public String getString() {
        System.out.println("Type a string:");
        String stringResponse = inputScan.nextLine();
        System.out.println(stringResponse);
        clearScanner();

        return stringResponse;
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue??");
        String booleanResponse = inputScan.nextLine();

            if (booleanResponse.equalsIgnoreCase("yes")) {
                return true;
            } else {
                return false;
            }

    }

    public int getInt(int min, int max) {
            System.out.println("Enter a number between " + min + " and " + max);
            String intResponse = inputScan.next();
            int parsedResponse = Integer.parseInt(intResponse);
        do {

            if (parsedResponse > min && parsedResponse < max) {
                System.out.println("Nice job!");
                break;
            } else {
                System.out.println("Try again...");
            }
        }while (true);
           clearScanner();
            return parsedResponse;
    }

    public int getInt() {
        System.out.println("Please type a number:");
        String numberResponse = inputScan.next();
        System.out.println(numberResponse);
        clearScanner();

        return Integer.parseInt(numberResponse);
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max);
        String doubleResponse = inputScan.next();
        double parsedResponse = Double.parseDouble(doubleResponse);
        do {
            if (parsedResponse > min && parsedResponse < max) {
                System.out.println("Nice job");
                break;
            } else {
                System.out.println("Try again...");
            }
        }while(true);
        clearScanner();
        return parsedResponse;
    }

    public double getDouble() {

        Double doubleResponse = inputScan.nextDouble();
        inputScan.nextLine();
        return doubleResponse;
    }

    public void clearScanner() {
        inputScan.reset();
    }
}



