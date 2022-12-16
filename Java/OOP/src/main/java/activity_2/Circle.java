package activity_2;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRasius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRasius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea(){
        Double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
