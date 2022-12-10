package pset8.abstract_shapes;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        double area = 0.0;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 0.0;
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s,width=%f,length=%f]", super.toString(), width, length);
    }
}
