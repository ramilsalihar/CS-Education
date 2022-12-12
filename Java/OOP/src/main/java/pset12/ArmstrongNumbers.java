package pset12;

public class ArmstrongNumbers {

    public boolean isArmstrongNumber(int number){
        String[] num = Integer.toString(number).split("");
        int power = num.length;
        int sum = 0;

        for (String s : num) {
            int part = (int) Math.pow(Integer.parseInt(s), power);
            sum += part;
        }

        return sum == number;
    }
}
