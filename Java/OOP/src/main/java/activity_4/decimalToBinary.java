package activity_4;

public class decimalToBinary {
    private static String decimalToBinary(int decimalNumber){

        int answer = 0;
        int counter = 0;
        String binaryNumber = "";

        while(decimalNumber != 0){
            int temporaryNumber;
            temporaryNumber = decimalNumber % 2;
            double exp = Math.pow(10, counter);
            answer += exp * temporaryNumber;
            decimalNumber /= 2;

            counter++;
        }

        binaryNumber = String.valueOf(answer);

        if (binaryNumber.length()<8){
            while(binaryNumber.length()<8){
                binaryNumber = String.format("0%s",binaryNumber);
            }
        }
        return binaryNumber;
    }
}
