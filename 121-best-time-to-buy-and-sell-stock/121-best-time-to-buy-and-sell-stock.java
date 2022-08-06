class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int mintillnow=prices[0],max=0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]>mintillnow){
                max=Math.max(max,prices[i]-mintillnow);
            }else{
                mintillnow=prices[i];
            }
        }
        return max;
    }
}