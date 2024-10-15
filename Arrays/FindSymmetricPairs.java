import java.util.*;

public class FindSymmetricPairs {
    public static void printSolution(int arr[][]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int second = arr[i][1];

            if(map.containsKey(second) && map.get(second) == first){
                System.out.println("("+ second+","+first+")");
            }else{
                map.put(first, second);
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{11,20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};

        printSolution(arr);
    }
}
