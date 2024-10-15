package Numbers;
class PerfectNumber {
    public static int printFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        
        return n*printFactorial(n-1);
    }
    int isPerfect(int N) {
        // code here
        int sum = 0;
        int originalNum = N;
        
        while(N > 0){
            int lastDigit = N%10;
            sum += printFactorial(lastDigit);
            N = N/10;
        }
        
        if(sum == originalNum){
            return 1;
        }
        return 0;
    }
}