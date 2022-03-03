class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] dp=new int[nums.length];
        int res=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]-nums[i-2]==nums[i]-nums[i-1]){
                dp[i]=dp[i-1]+1;
                res+=dp[i];
            }
        }
        return res;
    }
}