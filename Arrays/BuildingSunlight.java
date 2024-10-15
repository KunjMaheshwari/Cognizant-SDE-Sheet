public class BuildingSunlight {
    public static int printSolution(int arr[]){
        int count = 1;

        int maxHeight = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] >= maxHeight){
                count ++;
                maxHeight = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,8,3};

        System.out.println(printSolution(arr));
    }
}
