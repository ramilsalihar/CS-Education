package quiz;

public class Triangle {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        if(side1 > 0 && side2 > 0 && side3 > 0){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Incorrect input!");
        }

    }

    boolean isDegenerate(){
        boolean answer = false;

        if(((side1 + side2) == side3)
                || ((side1 + side3) == side2)
                || ((side3 + side2) == side1)){
            answer = true;
        }

        return answer;
    }

    boolean isEquilateral(){
        boolean answer = false;

        if(side1 == side2 && side2 == side3){
            answer = true;
        }

        return answer;
    }

    boolean isIsosceles(){
        boolean answer = false;

        if((side1 == side2) || (side3 == side2) || (side1 == side3)){
            answer = true;
        }

        return answer;
    }

    boolean isScalene(){
        boolean answer = false;

        if(side1 != side2 && side2 != side3 && side1 != side3){
            answer = true;
        }

        return answer;
    }

}
