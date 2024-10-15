public class SmallestAndLargest {
    public static void printSolution(String str){
        String words[] = str.split("\\s+");

        String largest = words[0];
        String smallest = words[0];

        for(String word : words){
            if(word.length() < smallest.length()){
                smallest = word;
            }
            if(word.length() > largest.length()){
                largest = word;
            }
        }

        System.out.println("Largest Value is: "+ largest);
        System.out.println("Smallest Value is: "+ smallest);
    }  
    public static void main(String args[]){
        String str = "My name is Kunj Maheshwari";

        printSolution(str);
        
    }
}
