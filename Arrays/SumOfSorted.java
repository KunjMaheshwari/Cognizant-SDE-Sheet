import java.util.*;

public class SumOfSorted {

    public static int printSolution(int arr1[], int arr2[]){
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            arr.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            arr.add(arr2[i]);
        }

        Collections.sort(arr);
        int mid = arr.size()/2;

        return arr.get(mid) + arr.get(mid-1);
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 6, 10};
        int arr2[] = {4, 5, 6, 9, 12};


        System.out.println(printSolution(arr1, arr2));
    }
}
