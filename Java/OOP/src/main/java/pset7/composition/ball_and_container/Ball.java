package pset7.composition.ball_and_container;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        double xDelta = speed * Math.cos(Math.toRadians(direction));
        double yDelta = speed * Math.sin(Math.toRadians(direction));

        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) xDelta;
        this.yDelta = (float) yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x = x + xDelta;
        this.y = y + yDelta;
    }

    public void reflectHorizontal(){
        this.xDelta = -xDelta;
    }

    public void reflectVertical(){
        this.yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return String.format(
                "Ball[(%f,%f),speed=(%f,%f)]",
                x, y,
                xDelta, yDelta
                );
    }
}
