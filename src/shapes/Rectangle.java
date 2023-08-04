package shapes;

public class Rectangle extends Quadrilateral implements Measurable {



    public Rectangle(double length, double width) {
        super(length, width);
    }
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }


}
