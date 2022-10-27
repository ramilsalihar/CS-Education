package activity_5;

import java.util.Arrays;
import java.util.Scanner;

public class zeroFront {

    int[] array = inputArray();

//    zeroFront.zeroMethod(array);

    public static void zeroMethod(int[] array){

        Arrays.sort(array);

        for (int element: array) {
            System.out.printf("%d ", element);
        }
    }

    private static int[] inputArray(){
        Scanner input = new Scanner(System.in);

        String line = input.nextLine().trim();

        int[] numbers = new int[line.split(" ").length];



//        for (int i=0; i<numbers.length;i++)
//            numbers[i] = Integer.parseInt(charList[i]);

        return numbers;

    }

}
