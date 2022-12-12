package pset12;

import java.util.ArrayList;
import java.util.Collections;

public class HandshakeCalculator {

    ArrayList<Signal> list = new ArrayList<>();

    public ArrayList<Signal> calculateHandshake(int number) {
        String binary = Integer.toBinaryString(number);
        int size = binary.length();

        // Going from the end
        for (int i = size-1; i >=0 ; i--) {
            // Checking if last element is one
            if (binary.charAt(i)=='1'){
                if(size-(i)==5){
                    Collections.reverse(list);
                }
                else if(size-(i)==4){
                    list.add(Signal.JUMP);
                }
                else if(size-(i)==3){
                    list.add(Signal.CLOSE_YOUR_EYES);
                }
                else if(size-(i)==2){
                    list.add(Signal.DOUBLE_BLINK);
                }
                else if(size-(i)==1){
                    list.add(Signal.WINK);
                }
            }
    }
        return list;
}
}
