public class ValidSubstring {
    public static int isValidSubstring(String str){
        int maxLength = 0;
        int open = 0;
        int close = 0;

        // left to right
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                open++;
            }else{
                close++;
            }

            if(open == close){
                maxLength = Math.max(maxLength, 2*open);
            }else if(close > open){
                open = close = 0;
            }
        }
        open = close = 0;

        // right to left
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == ')'){
                close++;
            }else{
                open++;
            }

            if(open == close){
                maxLength = Math.max(maxLength, 2*open);
            }else if(open > close){
                open = close= 0;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "((()))))";

        System.out.println(isValidSubstring(str));
    }
}
