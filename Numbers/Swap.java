package Numbers;
import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static ArrayList<Integer> printSolution(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;

        return new ArrayList<>(Arrays.asList(a, b));
    }
    public static void main(String[] args) {
        int a = 20;
        int b  =13;

        System.out.println(printSolution(a, b));
    }
}
