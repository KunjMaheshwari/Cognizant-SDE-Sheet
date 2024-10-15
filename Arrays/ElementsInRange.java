import java.util.*;

public class ElementsInRange {
    public static boolean printSolution(int arr[], int A, int B){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int i=A;i<=B;i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,12};
        int A = 5;
        int B = 10;

        System.out.println(printSolution(arr, A, B));
    }
}
