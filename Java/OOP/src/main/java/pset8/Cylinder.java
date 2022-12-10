package pset8;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double areaCylinder;
        areaCylinder = getPerimeter() * height + 2 * super.getArea();
        return areaCylinder;
        // super.getArea --> returns area of circle
    }

    public double getVolume(){
        double area = super.getArea();
        double volume;

        volume = area * height;
        return volume;
    }

    @Override
    public String toString() {
        return String.format("Cylinder[%.2f,%s,%.2f]", getRadius(), getColor(), getHeight());
    }
}
