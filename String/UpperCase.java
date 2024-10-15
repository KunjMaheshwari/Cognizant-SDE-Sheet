public class UpperCase {
    public static String printSolution(String str){
        char ch[] = str.toCharArray();

        if(Character.isLowerCase(ch[0])){
            ch[0] = Character.toUpperCase(ch[0]);
        }

        for(int i=1;i<ch.length;i++){
            if(ch[i-1] ==' '){
                if(Character.isLowerCase(ch[i])){
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "i love programming";

        System.out.println(printSolution(str));
    }
}
