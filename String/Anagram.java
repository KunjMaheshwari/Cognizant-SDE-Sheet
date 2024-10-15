import java.util.*;

public class Anagram {
    public static boolean isAnagram(String str1, String str2){
        char temp1[] = str1.toCharArray();
        char temp2[] = str2.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        String og1 = new String(temp1);
        String og2 = new String(temp2);

        if(og1.equals(og2)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";


        System.out.println(isAnagram(str1, str2));
    }
}
