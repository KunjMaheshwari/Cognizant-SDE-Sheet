public class SameCharacter {
    int sameChar(String A, String B) 
    {
        // Convert both strings to lowercase to ignore case sensitivity
        A = A.toLowerCase();
        B = B.toLowerCase();
        int count=0;
        
        // Use a HashSet to store unique characters from string B
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == B.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
