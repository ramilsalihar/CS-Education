package activity_3;

import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int ans = Math.min(Math.min(a, b), c);
        if(a == b && b == c){
            print("They are all equal");
        } else {
            String title = "The least of these three numbers is ";
            System.out.println(title + ans);
        }
    }


    public static void print(String input){
        System.out.println(input);
    }
}

