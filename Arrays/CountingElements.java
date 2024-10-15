import java.util.*;

public class CountingElements {
    public static ArrayList<Integer> printSolution(int arr1[], int arr2[]){
        Arrays.sort(arr2);
        
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            int count = 0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] >= arr2[j]){
                    count++;
                }else{
                    break;
                }
            }
            arr.add(count);
        }
        return arr;

    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,7,9};
        int arr2[] = {0,1,2,1,1,4};

        System.out.println(printSolution(arr1, arr2));
    }
}
