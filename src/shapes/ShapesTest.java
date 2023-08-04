package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(4, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable nextShape = new Rectangle(4, 5);
        System.out.println(nextShape.getArea());
        System.out.println(nextShape.getPerimeter());
    }

}
