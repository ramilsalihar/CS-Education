package pset7;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

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

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public double distance(int x, int y){
        MyPoint point = new MyPoint(x, y);

        double x_diff = this.x - point.x;
        double y_diff = this.y - point.y;

        return Math.sqrt(x_diff * x_diff + y_diff * y_diff);
    }

    public double distance(MyPoint another){
        double x_diff = this.x - another.x;
        double y_diff = this.y - another.y;

        return Math.sqrt(x_diff * x_diff + y_diff * y_diff);
    }

    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
