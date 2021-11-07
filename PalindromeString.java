import java.util.*;
public class PalindromeString {
    public static void main(String args[]) {
      String val="kayak";
      System.out.println(isPalindromeString(val));
    }
    
    public static boolean isPalindromeString(String val) {
        if((val == null) || (val.length() == 1)){
            return false;
        }
        int low =0;
        int high = val.length()-1;
        int mid= high/2;
        int idx=0;
        while(idx<mid) {
            if(val.charAt(low) != val.charAt(high)) {
                return false;
            }
            low++;
            high--;
            idx++;
        }
        return true;
    }
}
