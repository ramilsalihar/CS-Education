package activity_4;

public class binaryToDecimal {
    private static int binaryToDecimal(int binaryNumber){
        int decimalNumber;
        int counter;

        decimalNumber = 0;
        counter = 0;

        while(true){
            if(binaryNumber == 0){
                break;
            } else {
                int temporary;
                temporary = binaryNumber % 10;
                decimalNumber += temporary * Math.pow(2, counter);
                binaryNumber /= 10;
                counter++;
            }
        }

        return decimalNumber;
    }
}
