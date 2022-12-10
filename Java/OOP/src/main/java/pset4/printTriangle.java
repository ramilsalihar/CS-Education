package pset4;

public class printTriangle {
    private static void printTriangle(int n) {
        int count = 1;
        int spaces = n - count;

        while(count <= n){
            for(int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
            for(int j = 0; j < count; j++){
                System.out.printf("%d", j+1);
            }

            spaces--;
            count++;
            System.out.println();
        }
    }
}
