class Solution {
    public int arraySign(int[] nums) 
    {
        double pro=1;
        for(int i : nums){
            pro*=i;
        }
        
        if(pro>0)
            return 1;
        if(pro<0)
            return -1;
        return 0;
    }
}