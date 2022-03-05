class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer> countmap=new HashMap<>();
        int max=0;
        
        for(int i: nums){
            countmap.put(i,countmap.getOrDefault(i,0)+i);
            max=Math.max(max,i);
        }
        int[] dp=new int[max+1];
        dp[1]= countmap.getOrDefault(1, 0);
        
        for(int i=2;i<dp.length;i++){
            int earn=countmap.getOrDefault(i,0);
            dp[i]=Math.max(dp[i-1],dp[i-2]+earn);
        }
        return dp[max];
    }
}