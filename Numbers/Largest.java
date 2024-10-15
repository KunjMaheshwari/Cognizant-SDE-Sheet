package Numbers;
public class Largest {
    public static int printLargest(int a, int b, int c){
        int largest = (a>b && a>c) ? a : (b>c && b>a) ? b : c;
        return largest;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 98;
        int c = 42;

        System.out.println(printLargest(a, b, c));
    }
}
