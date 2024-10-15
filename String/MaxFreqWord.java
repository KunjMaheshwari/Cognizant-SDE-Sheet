import java.util.*;

public class MaxFreqWord {
    public static String printSolution(String str){
        String words[] = str.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        int maxfreqelement = 0;
        String maxFreq = "";

        for(String word : words){
            int freq = map.get(word);

            if(freq > maxfreqelement){
                maxFreq = word;
                maxfreqelement = freq;
            }
        }
        return maxFreq +" "+maxfreqelement;
    }
    public static void main(String[] args) {
        String str = "The sky is the blue.";

        System.out.println(printSolution(str));
    }
}
