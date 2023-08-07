package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input promptRadius = new Input();
        do {
        System.out.println("Please enter the radius of your circle: ");
        double radius = promptRadius.getDouble();
            Circle circleOne = new Circle(radius);

            System.out.println("The circle's area is : " + circleOne.getArea());
            System.out.println("The circle's circumference is " + circleOne.getCircumference());

            System.out.println("Would you like to make another circle?");

        } while(promptRadius.yesNo());
    }
}
