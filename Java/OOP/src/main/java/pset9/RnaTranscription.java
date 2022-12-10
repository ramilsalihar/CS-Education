package pset9;

public class RnaTranscription {

    public String transcribe(String word){
        StringBuilder ans = new StringBuilder();
        int length = word.length();

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);

            switch (ch){
                case 'G':
                    ans.append("C");
                    break;
                case 'C':
                    ans.append("G");
                    break;
                case 'T':
                    ans.append("A");
                    break;
                case 'A':
                    ans.append("U");
                    break;
                default:
                    break;
            }

        }

        return ans.toString();

    }
}
