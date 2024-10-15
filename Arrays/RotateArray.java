import java.util.*;

public class RotateArray{
    public static void printRotation(int arr[], int k){
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
    }    

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        printRotation(arr, k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}