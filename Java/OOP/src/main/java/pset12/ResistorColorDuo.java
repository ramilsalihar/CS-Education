package pset12;

import java.util.HashMap;

public class ResistorColorDuo {
    private HashMap<String, String> resistorsColor = new HashMap<>();


    public ResistorColorDuo(){
        resistorsColor.put("black", "0");
        resistorsColor.put("brown", "1");
        resistorsColor.put("red", "2");
        resistorsColor.put("orange", "3");
        resistorsColor.put("yellow", "4");
        resistorsColor.put("green", "5");
        resistorsColor.put("blue", "6");
        resistorsColor.put("violet", "7");
        resistorsColor.put("grey", "8");
        resistorsColor.put("white", "9");
    }

    public int value(String[] colors){
        String result = "";

        for(String word: colors){
            if(result.length() < 2){
                result += resistorsColor.get(word.toLowerCase());
            }
        }

        return Integer.parseInt(result);
    }

}
