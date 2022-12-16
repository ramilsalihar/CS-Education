package activity_4;

public class primes {
    private static void primeList(int num){
        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                System.out.printf("%d ", i);
            }
        }

    }

    public static boolean isPrime(int num){
        boolean answer = true;

        if(num == 2){
            return true;
        } else {
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    answer = false;
                    break;
                }
            }
            return answer;
        }
    }
}
