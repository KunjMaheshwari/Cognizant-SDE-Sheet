package Sorting;
public class BinarySearch{
    public static int printSolution(int arr[], int k){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] > k){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,7,9,10};
        int k = 5;

        System.out.println(printSolution(arr, k));
    }
}

// O(logn);