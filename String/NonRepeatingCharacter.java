import java.util.*;

public class NonRepeatingCharacter {
    public static char printSolution(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String str = "hello";

        System.out.println(printSolution(str));
    }
}