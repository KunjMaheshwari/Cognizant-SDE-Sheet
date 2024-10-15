public class CountSubstring{

    public static int printSolution(String str){
        int count = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        int result = (count*(count-1)/2);
        return result;
    }
    public static void main(String args[]){
        String str = "100101";


        System.out.println(printSolution(str));
    }
}