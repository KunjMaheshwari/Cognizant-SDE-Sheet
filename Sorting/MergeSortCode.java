package Sorting;
public class MergeSortCode {


    public static void mergeSort(int arr[], int si, int ei){

        // base condition
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); // for the left part of the array
        mergeSort(arr, mid+1, ei); // for the right part of the array

        merge(arr, si, mid, ei);
    }


    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1]; // new Array Size

        // create the new iterator indexes
        int i = si; // iterator index for the left array
        int j = mid+1; // iterator index for the right array

        int k = 0; // iterator index for the temp[] array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        // for the remaining elements

        // left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to the original array

        for(k=0, i=si;k<temp.length;k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {6,3,5,8,9,2};

        mergeSort(arr, 0, arr.length-1);

        printArray(arr);
    }
}
