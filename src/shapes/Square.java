package shapes;

public class Square extends Quadrilateral {


   public Square(double length, double width) {
       super(length, width);
   }
    public double getPerimeter() {
        return this.length * 4;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
       this.length = width;
       this.width = width;
    }

}
