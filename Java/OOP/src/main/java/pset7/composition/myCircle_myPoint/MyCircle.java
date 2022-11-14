package pset7.composition.myCircle_myPoint;

public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY(){
        return new int[]{center.getX(), center.getY()};
    }

    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return String.format("MyCircle[radius=%d,center=(%d,%d)]", radius, getCenterX(), getCenterY());
    }

    public double getArea(){
        double area = 0.0;

        area = Math.PI * radius*radius;

        return area;
    }

    public double getCircumference(){
        double circumference = 0.0;

        circumference = 2 * Math.PI * radius;

        return circumference;
    }

    public double distance(MyCircle another){
        double distance = 0.0;

        int xDist = another.getCenterX() - this.getCenterX();
        int yDist = another.getCenterY() - this.getCenterY();
        distance = Math.sqrt(xDist * xDist + yDist * yDist);

        return distance;
    }
}
