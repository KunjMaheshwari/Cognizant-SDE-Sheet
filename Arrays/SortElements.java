import java.util.*;

public class SortElements {
    public static void printSolution(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                int freqA = map.get(a);
                int freqB = map.get(b);

                if(freqA != freqB){
                    return freqB - freqA;
                }
                return a-b;
            }
        });

        // Print the sorted List 
        HashSet<Integer> set = new HashSet<>();
        for(int num : list){
            if(!set.contains(num)){
                for(int i=0;i<map.get(num);i++){
                    System.out.print(num+" ");
                }
                set.add(num);
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printSolution(arr);

        sc.close();
    }
}
