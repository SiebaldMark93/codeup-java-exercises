package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    
    public Rectangle() {
        
    }
    
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public Rectangle(int i) {
        super();
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    
}
