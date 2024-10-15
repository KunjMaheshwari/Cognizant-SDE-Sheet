package Numbers;
public class Armstrong {
    public static int calculateCube(int n){
        return n*n*n;
    }
    static String armstrongNumber(int n) {
        // code here
        int sum = 0;
        
        int originalNum = n;
        
        while(n >0){
            int lastDigit = n%10;
            sum += calculateCube(lastDigit);
            n = n/10;
        }
        
        if(sum == originalNum){
            return "true";
        }
        return "false";
    }
}