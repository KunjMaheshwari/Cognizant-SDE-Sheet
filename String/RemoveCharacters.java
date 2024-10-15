import java.util.*;

public class RemoveCharacters {

    public static String printSolution(String str1, String str2){
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str2.length();i++){
            set.add(str2.charAt(i));
        }

        for(int i=0;i<str1.length();i++){
            if(!set.contains(str1.charAt(i))){
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "Computer";
        String str2 = "pu";


        System.out.println(printSolution(str1, str2));
    }
}
