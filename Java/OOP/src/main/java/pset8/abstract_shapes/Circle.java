package pset8.abstract_shapes;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        return String.format("Circle[%s,radius=%f]", super.toString(), radius);
    }
}
