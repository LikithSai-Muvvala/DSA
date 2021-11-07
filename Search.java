import java.util.*;
public class Search {
    public static void main(String args[]) {
      int[] vals = {1,2,3,4,5,6,7,8,9};
      System.out.println(linearSearch(vals, 9));
      System.out.println(binarySearch(vals, 9));
    }
    
    private static int linearSearch(int[] vals, int value) {
        for(int idx=0; idx<vals.length; idx++) {
            if(vals[idx]== value) {
                return idx;
            }
        }
        return -1;
    }
    
    private static int binarySearch(int[] vals, int value) {
        int low=0;
        int high=vals.length;
        int mid = (low+high)/2;
        while(low<high) {
            mid = (low+high)/2;
            if(vals[mid] == value) {
                return mid;
            } else if(value < vals[mid]) {
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }
}
