package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input promptRadius = new Input();
        do {
        System.out.println("Please enter the radius of your circle: ");

        double userInput = promptRadius.getDouble();
            Circle circleOne = new Circle(userInput);

            System.out.println("The circle's area is : " + circleOne.getArea());
            System.out.println("The circle's circumference is " + circleOne.getCircumference());

            promptRadius.yesNo();

        } while(true);
    }
}