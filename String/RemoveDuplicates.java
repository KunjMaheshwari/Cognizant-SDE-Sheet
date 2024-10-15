import java.util.*;

public class RemoveDuplicates {
    public static String printSolution(String str){
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(printSolution(str));

        sc.close();
    }
}
