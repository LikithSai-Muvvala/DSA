import java.util.*;
public class LargestSumInContinousSubArray {
    public static void main(String args[]) {
      int[] vals = {-2,-3,5,6,-6,7,8,9};
      largestSumInContinousSubArray(vals);
    }
    
    public static void largestSumInContinousSubArray(int[] vals) {
        int sum=Integer.MIN_VALUE;
        int currSum=0;
        int startIndex=0;
        int endIndex=0;
        for(int idx=0; idx<vals.length; idx++) {
            System.out.println(String.format("%d is at Index: %d", vals[idx], idx));
            currSum =  currSum + vals[idx];
            if(currSum > sum) {
                endIndex=idx;
                sum = currSum;
            }
            if(currSum < 1) {
                startIndex=idx+1;
                currSum=0;
            }
        }
        System.out.println(String.format("StartIndex: %d, EndIndex: %d, Sum: %d", startIndex, endIndex, sum));
    }
}
