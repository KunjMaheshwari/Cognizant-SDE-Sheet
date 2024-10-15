public class RemoveSpaces {
    public static String printSolution(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str ="Kunj Maheshwari VIT Bhopal";

        System.out.println(printSolution(str));
    }
}
