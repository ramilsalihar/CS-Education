package pset9;

public class Hamming {
    private String DnaOne;
    private String DnaTwo;
    private int HammingDistance = 0;

    public Hamming(String DnaOne, String DnaTwo) {
        this.DnaOne = DnaOne;
        this.DnaTwo = DnaTwo;
    }
    public int getHammingDistance(){
        int length = DnaOne.length();

        for (int i = 0; i < length; i++) {
            char first = DnaOne.charAt(i);
            char second = DnaTwo.charAt(i);
            if(first != second){
                HammingDistance++;
            }
        }
        return HammingDistance;
    }
}
