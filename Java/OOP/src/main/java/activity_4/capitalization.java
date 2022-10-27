package activity_4;

public class capitalization {
    public static void capitalize(String sentence){
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>1){
                words[i]= words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            }
            else{
                words[i]= words[i].substring(0,1).toUpperCase();
            }

        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
