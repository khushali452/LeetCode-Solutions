import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int cur=0;
        for(int x:nums)
        {
            if(cur<0) cur=0;
            cur += x;
            max_sum =  Math.max(max_sum , cur);
        }
        return max_sum;
    }
}