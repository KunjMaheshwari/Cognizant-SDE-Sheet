public class Reverse {
    // Complete the function
    // str: input string
    public static String reverseString(String s) {
        // Reverse the string str
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
        
    }
}