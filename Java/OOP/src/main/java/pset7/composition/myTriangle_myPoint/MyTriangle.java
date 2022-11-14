package pset7.composition.myTriangle_myPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2,int x3, int y3){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return String.format(
                "MyTriangle[v1=(%d,%d),v2=(%d,%d),v3=(%d,%d)]",
                v1.getX(), v1.getY(),
                v2.getX(), v2.getY(),
                v3.getX(), v3.getY()
                );
    }

    public double getPerimeter(){
        double perimeter = 0.0;

        double dist1 = v1.distance(v2);
        double dist2 = v2.distance(v3);
        double dist3 = v3.distance(v1);

        perimeter = dist1 + dist2 + dist3;

        return perimeter;
    }

    public String getType(){
        String type = "";

        double dist1 = v1.distance(v2);
        double dist2 = v2.distance(v3);
        double dist3 = v3.distance(v1);

        if(dist1 == dist2 && dist2 == dist3)
            type = "equilateral";
        else if(dist1 != dist2 && dist2 != dist3 && dist1 != dist3)
            type = "scalene";
        else
            type = "isosceles";

        return type;
    }
}
