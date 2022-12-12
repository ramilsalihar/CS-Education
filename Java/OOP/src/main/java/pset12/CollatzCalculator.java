package pset12;

public class CollatzCalculator {
    public int computeStepCount(int number) {
        int steps = 0;
            if(number >= 1){
                while(number > 1){
                    if(number % 2 == 0){
                        number /= 2;
                    } else {
                        number *= 3;
                        number += 1;
                    }
                    steps++;
                }
            } else {
                throw new IllegalArgumentException("Only natural numbers are allowed");
        }
        return steps;
    }
}
