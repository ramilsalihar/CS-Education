package activity_4;

public class abbreviate {
    private static String abbreviate(String word) {
        int n = word.length();
        String newWord;
        int l = n - 2;

        if(n > 10){
            newWord = word.charAt(0) + Integer.toString(l) + word.charAt(n-1);
        } else {
            newWord = word;
        }

        return newWord;
    }
}
