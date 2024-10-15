import java.util.*;

public class AlternateArray {
    public static void printSolution(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printSolution(arr);

        sc.close();
    }
}
