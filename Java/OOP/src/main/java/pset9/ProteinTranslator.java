package pset9;

import java.util.ArrayList;
import java.util.List;

public class ProteinTranslator {
    private String rna;


    public ProteinTranslator(String rna) {
        this.rna = rna;
    }

    public ProteinTranslator() {
    }

    public List<String> translate(String rna){
        List<String> list = new ArrayList<>();

        for (int i = 0; i+3 <= rna.length(); i+=3) {

            String ans = protein(rna.substring(i,i+3));

            if(ans.equals("STOP")){
                return list;
            }
            else{
                list.add(ans);
            }

        }

        return list;
    }

    public String protein(String temp){
        String result = "";
        switch (temp){
            case "AUG":
                result = "Methionine";
                break;
            case "UUU": case "UUC":
                result ="Phenylalanine";
                break;
            case "UUA": case "UUG":
                result ="Leucine";
                break;
            case "UCU": case "UCC": case "UCA": case "UCG":
                result ="Serine";
                break;
            case "UAU": case "UAC":
                result ="Tyrosine";
                break;
            case "UGU": case "UGC":
                result ="Cysteine";
                break;
            case "UGG":
                result ="Tryptophan";
                break;
            case "UAA": case "UAG": case "UGA":
                result = "STOP";
                break;
            default:
                break;
        }
        return result;
    }
}
