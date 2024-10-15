package Numbers;
public class PalindromeSum {
    public static int printSolution(int n){
        int originalNum = n;
        int sum = 0;

        while(originalNum >0){
            sum += originalNum%10;
            originalNum = originalNum/10;
        }

        int reversedNum = 0;
        int originalSum = 0;

        while(sum > 0){
            reversedNum = reversedNum*10 + (sum%10);
            sum = sum/10;
        }

        if(reversedNum == originalSum){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 56;

        System.out.println(printSolution(n));
    }
}
