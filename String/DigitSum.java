public class DigitSum {
    public static int printSolution(String str){
        int sum = 0;
        int num = 0;


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0'); //remember this
            }else{
                sum += num;
                num = 0;
            }
        }
        sum += num;

        return sum;
    }
    public static void main(String args[]){
        String str = "1abc23";

        System.out.println(printSolution(str));
    }
}
