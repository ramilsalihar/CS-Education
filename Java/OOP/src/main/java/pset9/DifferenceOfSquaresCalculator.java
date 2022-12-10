package pset9;

public class DifferenceOfSquaresCalculator {
    public int computeSumOfSquaresTo(int num){
        int sumOfSquares = 0;

        for (int i = 1; i <= num; i++) {
            sumOfSquares += Math.pow(i,2);
        }

        return sumOfSquares;
    }

    public int computeSquareOfSumTo(int num){
        return (int)Math.pow((num*(num+1))/2,2);
    }

    public int computeDifferenceOfSquares(int num){
        int squareSum = computeSquareOfSumTo(num);
        int sumOfSquare = computeSumOfSquaresTo(num);

        int result = squareSum - sumOfSquare;

        return result;
    }
}
