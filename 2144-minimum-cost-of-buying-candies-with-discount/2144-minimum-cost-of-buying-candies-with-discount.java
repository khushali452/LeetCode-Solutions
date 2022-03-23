class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res=0;
        for(int i=0;i<cost.length;i++){
            if (i % 3 != cost.length % 3)
                res += cost[i];
        }
        return res;
    }
}