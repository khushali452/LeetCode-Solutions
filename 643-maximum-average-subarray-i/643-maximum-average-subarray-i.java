class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long max= 0;
        
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        long sum=max;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            max=Math.max(sum,max);
        }
        return (max*1.0)/k;
    }
}