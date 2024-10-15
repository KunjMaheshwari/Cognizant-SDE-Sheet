import java.util.*;

public class RepeatedElements {
    public static ArrayList<Integer> printSolution(int arr[]){

        ArrayList<Integer> newArr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                newArr.add(entry.getKey());
            }
        }
        return newArr;

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,2,4,3};
        
        System.out.println(printSolution(arr));
    }
}
