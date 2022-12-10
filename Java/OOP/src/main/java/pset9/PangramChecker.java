package pset9;

import java.util.HashSet;
import java.util.Locale;

public class PangramChecker {

    public boolean isPangram(String word){
        //  The root locale is the locale whose language, country, and variant are empty ("") strings.
        word = word.toLowerCase(Locale.ROOT);
        HashSet<Character> hashSet = new HashSet<>();

        final int lengthOfWord = word.length();

        for (int i = 0; i < lengthOfWord; i++) {
            // checking if given letter is among alphabet
            int firstLetter = (int)word.charAt(i);
            int lastLetter = (int)word.charAt(i);

            if(firstLetter >= 97 && lastLetter <= 122){
                hashSet.add(word.charAt(i));
            }
        }

        if(hashSet.size()==26){
            return true;
        }
        else{
            return false;
        }
    }
}
