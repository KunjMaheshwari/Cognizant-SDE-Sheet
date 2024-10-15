import java.util.*;

public class PalindromeArray {
    public static boolean isPalindrome(int arr[]){
        for(int i=0;i<arr.length;i++){
            String str = arr[i] +"";

            StringBuilder sb = new StringBuilder(str);

            if(!str.equals(sb.reverse().toString())){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isPalindrome(arr));


        sc.close();
    }
}
