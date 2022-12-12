package pset12;

public class Acronym {
    private String phrase;
    public Acronym(String phrase) {
        this.phrase = phrase;
    }


    public String get() {
        String[] list = phrase.split(" ");
        String answer = "";

        for(String word: list){
            answer += word.charAt(0);
        }

        return answer.toUpperCase();
    }
}
