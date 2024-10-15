import java.util.*;

public class MissingNumber {
    public static int printSolution(int arr[]){
        int totalSum = arr.length;
        int currentSum = 0;

        for(int i=0;i<arr.length-1;i++){
            currentSum += arr[i];
            totalSum += i+1;
        }

        return totalSum - currentSum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(printSolution(arr));
        sc.close();
    }
}
