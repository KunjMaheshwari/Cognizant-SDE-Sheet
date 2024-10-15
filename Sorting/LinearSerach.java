package Sorting;
public class LinearSerach {
    public static int printSolution(int arr[], int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};

        int k = 4;

        System.out.println(printSolution(arr, k));
    }
}

// O(N);
