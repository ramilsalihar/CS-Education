package pset8.shapes;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
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

    public double getArea(){
        double area = 0.0;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 0.0;
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s,width=%f,length=%f]", super.toString(), width, length);
    }
}
