package pset7.composition.ball_and_container;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // (x1, y1) --> top-left angle of container
    // (x2, y2) --> bottom-right angle of container
    public Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth(){
        return (x2 - x1);
    }

    public int getHeight(){
        return (y1 - y2);
    }

    public boolean collides(Ball ball){
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Container[(%d,%d),(%d,%d)]", x1, y1, x2, y2);
    }
}
