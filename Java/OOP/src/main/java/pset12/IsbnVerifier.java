package pset12;

public class IsbnVerifier {

    public boolean isValid(String isbn) {
        try{
            // Only digits are remained
            String word = String.join("",isbn.split("-"));
            int compare = 0;

            // If word is not exactly 10 --> false
            if(word.length() != 10){
                return false;
            }

            int index = 0;
            for (int i = 10; i > 0; i--) {
                // Checking if last is digit or X
                int compare1 = Integer.parseInt(Character.toString(word.charAt(index)));
                if(index == 9){
                    if(word.charAt(index) == 'X'){
                        compare += 10;
                        compare %= 11;
                    }
                    else{
                        compare += compare1;
                        compare %= 11;
                    }
                }
                else{
                    compare += compare1 * i;
                    compare %= 11;
                }
                index++;

            }


            if(compare == 0){
                return true;
            }
            else{
                return false;
            }

        } catch (Exception e){
            return false;
        }
    }
}
