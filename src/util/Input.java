package util;
import java.util.Scanner;
public class Input {

    Scanner inputScan;

    public Input() {
        inputScan = new Scanner(System.in);
    }

    public String getString() {
        clearScanner();
        return inputScan.nextLine();
    }

    public boolean yesNo() {
        clearScanner();
        return getString().trim().toLowerCase().startsWith("y");
    }

    public int getInt(int min, int max) {
            int intResponse = getInt();
            if (intResponse > min && intResponse < max) {
                return intResponse;
            } else {
                System.out.printf("The number must be between %d and %d.%n", min, max);
               return getInt(min, max);
            }
    }

    public int getInt() {
        clearScanner();
        try {
            return Integer.parseInt(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("You must enter a whole number...");
            return this.getInt();
        }
    }

    public double getDouble(double min, double max) {
        double doubleResponse = getDouble();
        if (doubleResponse > min && doubleResponse < max) {
            return doubleResponse;
        } else {
            System.out.printf("The number must be between %f and %f.%n", min, max);
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        try {
            return Double.parseDouble(this.getString());
        } catch (NumberFormatException error) {
            System.out.println("You must enter a whole number...");
            return this.getDouble();
        }
    }

    public void clearScanner() {
        inputScan.reset();
    }
    public int getBinary() {
            System.out.println("Enter a binary number to convert:");
        try {
            return Integer.valueOf(getString(), 2);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, this doesn't work.");
            return Integer.valueOf(getString(), 2);
        }
    }

    public int getHexidecimal() {
        System.out.println("Enter a hexidecimal number to convert:");
        try{
            return Integer.valueOf(getString(), 16);
        } catch (NumberFormatException e) {
            System.out.println("Sorry that didn't work.");
            return Integer.valueOf(getString(), 16);
        }
    }
}




