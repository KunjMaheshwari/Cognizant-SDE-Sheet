public class RomantoInteger {
    public static int printSolution(String str){
        int values[] = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int totalValue = 0;
        int prevValue = 0;

        for(int i=str.length()-1;i>=0;i--){
            int currentValue = values[str.charAt(i)];

            if(currentValue < prevValue){
                totalValue -= currentValue;
            }else{
                totalValue += currentValue;
            }

            prevValue = currentValue;
        }
        return totalValue;
    }
    public static void main(String[] args) {
        String str = "IIV";

        System.err.println(printSolution(str));
    }
}
