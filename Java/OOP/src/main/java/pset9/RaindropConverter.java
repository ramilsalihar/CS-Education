package pset9;

public class RaindropConverter {
    private int num;

    public String convert(int number){
        String answer = "";
        boolean cond = false;

        if(number % 3 == 0){
            answer += "Pling";
            cond = true;
        }
        if(number % 5 == 0){
            answer += "Plang";
            cond = true;
        }
        if(number % 7 == 0){
            answer += "Plong";
            cond = true;
        }

        // Else just output the number itself
        if(cond){
            return answer;
        }
        else{
            return Integer.toString(number);
        }

    }
}
