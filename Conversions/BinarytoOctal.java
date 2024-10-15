package Conversions;
public class BinarytoOctal {
    public static int printSolution(String str){
        int n = Integer.toOctalString(Integer.parseInt(str, 2));
        return n;
    }
}
