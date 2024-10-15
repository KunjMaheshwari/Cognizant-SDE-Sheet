package Numbers;
public class SumofGP {
    public static int printSolution(int n, int r, int a){
        int numerator = (int)Math.pow(r, n)-1;
        int denominator = r-1;

        return a*numerator/denominator;
    }
    public static void main(String[] args) {
        int n = 3;
        int r = 2;
        int a = 3;

        System.out.println(printSolution(n, r, a));
    }
}
