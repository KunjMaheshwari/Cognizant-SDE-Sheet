package Numbers;
public class DeficientNumber {
    static String isDeficient(long x){
        long sum=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        if(sum<=(2*x)){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}