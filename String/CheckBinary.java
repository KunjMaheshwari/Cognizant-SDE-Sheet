public class CheckBinary
{
	boolean isBinary(String str)
	{
	  //Your code here
	  int sum = 0;

      for(int i=0;i<str.length();i++){
        sum += Integer.parseInt(String.valueOf(str.charAt(i)));
      }

      if(sum <= str.length()){
        return true;
      }
      return false;
	}
}