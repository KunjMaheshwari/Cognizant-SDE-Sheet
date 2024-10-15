package Numbers;
public class Leap {
    public static boolean isLeap(int N){
        if((N % 400 == 0) || (N %4 == 0 && N%100 != 0)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int N = 2024;

        System.out.println(isLeap(N));
    }
}
