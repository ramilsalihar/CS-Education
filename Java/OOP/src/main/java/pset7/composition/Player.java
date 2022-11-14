package pset7.composition;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp){

    }

    public void jump(float zDisp){

    }

    public boolean near(Ball ball){
        double distance = 0.0f;

        double xDist = (this.x - ball.getX()) * (this.x - ball.getX());
        double yDist = (this.y - ball.getY()) * (this.y - ball.getY());

        distance = Math.sqrt(xDist + yDist);

        return distance < 8.0;
    }

    public void kick(Ball ball){

    }
}
