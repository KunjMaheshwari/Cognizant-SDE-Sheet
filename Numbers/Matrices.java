package Numbers;
public class Matrices {
    public static int printSolution(int n){
        int mod = 100000007;

        int a = 0;
        int b = 1;

        if(n == 1){
            return 1;
        }

        for(int i=0;i<n-1;i++){
            int temp = b;
            b = (b+a)% mod;
            a = temp;
        }

        return b;
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println(printSolution(n));
    }
}
