package pset7.composition.myTriangle_myPoint;

import pset7.composition.myCircle_myPoint.MyCircle;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(MyPoint another){
        double distance = 0.0;

        int xDist = another.getX() - this.getX();
        int yDist = another.getY() - this.getY();
        distance = Math.sqrt(xDist * xDist + yDist * yDist);

        return distance;
    }
}
