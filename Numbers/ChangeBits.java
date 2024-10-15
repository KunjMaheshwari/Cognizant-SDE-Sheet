package Numbers;
public class ChangeBits {
    public static int[] printSolution(int n){
        int binaryLength = Integer.toBinaryString(n).length();

        int newNumber = (1 << binaryLength) -1;

        int difference = newNumber - n;

        return new int[]{difference, newNumber};
    }
    public static void main(String[] args) {
        int n = 8;

        int result[] = printSolution(n);
        System.out.print(result[0]);
        System.out.println();
        System.out.print(result[1]);
    }
}
