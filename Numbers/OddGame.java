package Numbers;
public class OddGame {
    public static Long printSolution(long N) {
        if (N == 1) {
            return N;
        }

        long ans = 2;

        while (ans < N) {
            ans = ans * 2;
        }

        if (ans > N) {
            ans = ans / 2;
        }

        return ans;

    }

    public static void main(String[] args) {
        int N = 5;

        System.out.println(printSolution(N));
    }
}