public class Palindrome {
    public static int printSolution(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
    public static void main(String[] args) {
        String str = "abba";

        System.out.println(printSolution(str));
    }
}
