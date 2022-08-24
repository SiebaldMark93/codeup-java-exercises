package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    public double getPerimeter() {
        return super.length * 4;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public void setLenght() {

    }

    public void setWidth() {

    }
}
