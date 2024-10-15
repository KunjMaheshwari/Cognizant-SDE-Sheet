import java.util.*;

public class FindIndex {

    public static int[] printSolution(int arr[], int target){
        int firstIdx = -1;
        int lastIdx = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                if(firstIdx == -1){
                    firstIdx = i;
                }
                lastIdx = i;
            }
        }
        
        if(firstIdx == -1){
            return new int[]{-1, -1};
        }else{
            return new int[]{firstIdx, lastIdx};
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();


        System.out.println(printSolution(arr, target));

        sc.close();
    }
}
