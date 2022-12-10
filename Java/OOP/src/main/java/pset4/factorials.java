package pset4;

public class factorials {
    private static void factorialofN(int n) {
        int factorial = 1;

        if(n < 0){
            System.out.println("Incorrect input!");
        } else {
            System.out.printf("X    X!%n");
            System.out.printf("%d    %d%n", 0, factorial);

            for(int i = 1; i <= n; i++){
                factorial *= i;
                System.out.printf("%d    %d%n", i, factorial);
            }
        }
    }
}
