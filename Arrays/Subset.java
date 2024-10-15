import java.util.*;

public class Subset {

    public static boolean isSubset(int arr1[], int arr2[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }

        for(int i=0;i<arr2.length;i++){
            if(!map.containsKey(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[] = {11,1,13,21,3,7};
        int arr2[] = {11,3,7,1};

        System.out.println(isSubset(arr1, arr2));
    }
}
