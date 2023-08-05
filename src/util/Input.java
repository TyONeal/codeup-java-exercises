package util;
import java.util.Scanner;
public class Input {

    private Scanner inputScan = new Scanner(System.in);

    public String getString() {
        clearScanner();
        return inputScan.nextLine();
    }

    public boolean yesNo() {
        clearScanner();
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
        clearScanner();
        return inputScan.nextInt();
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
        clearScanner();
        return inputScan.nextDouble();
    }

    public void clearScanner() {
        inputScan.reset();
    }
}



