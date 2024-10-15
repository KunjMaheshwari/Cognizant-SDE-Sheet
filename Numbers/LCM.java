package Numbers;
public class LCM {
    public static int calculateHCF(int n, int m){
        while(n>0 && m>0){
            if(n>m){
                n = n%m;
            }else{
                m = m%n;
            }
        }
        if(n == 0){
            return m;
        }
        return n;
    }
    public static int printSolution(int n, int m){
        return (n*m)/calculateHCF(n, m);
    }
    public static void main(String[] args) {
        int n= 5;
        int m = 10;

        System.out.println(printSolution(n, m));
    }
}
