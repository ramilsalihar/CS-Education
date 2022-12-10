package pset4;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        int[] array = inputArray();





    }

    private static int[] inputArray(){
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        String[] charList = line.split(" ");
        int[] numbers = new int[charList.length];

        for (int i=0; i<numbers.length;i++)
            numbers[i] = Integer.parseInt(charList[i]);

        return numbers;
    }

}
