package pset12;

import java.util.HashSet;

public class IsogramChecker {

    public boolean isIsogram(String s) {
        boolean answer = false;
        HashSet<String> set = new HashSet<String>();
        String[] list = s.split("");

        // check for empty string
        if(s.isEmpty()){
            answer = true;
        }

        for(String word: list){
            set.add(word);
        }

        int initialLength = s.length();
        int newLength = set.size();

        if(initialLength - newLength == 0){
            answer = true;
        }

        return answer;
    }
}
