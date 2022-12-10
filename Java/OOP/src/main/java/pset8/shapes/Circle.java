package pset8.shapes;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        return String.format("Circle[%s,radius=%f]", super.toString(), radius);
    }
}
