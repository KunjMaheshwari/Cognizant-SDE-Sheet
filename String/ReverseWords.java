public class ReverseWords {
    public static String printSolution(String str){
        String s[] = str.split("\\.");
        String out ="";

        for(int i=s.length-1;i>=0;i--){
            out += s[i];
            if(i>0){
                out += '.';
            }
        }
        return out;

    }
    public static void main(String[] args) {
        String str = "pqr.mno";

        System.out.println(printSolution(str));
    }
}
