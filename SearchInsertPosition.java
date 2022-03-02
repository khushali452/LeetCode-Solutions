class Solution {
    public int searchInsert(int[] nums, int target) {
       if(target>nums[nums.length -1]){
           return nums.length;
       } 
        
        int left = 0;
        int right=nums.length-1;
        
        while(left<right){
            int mid= left + (right-left)/2;
            if(target >nums[mid]){
                left= mid+1;
            }
            else{
                right= mid;
            }
        }
        return left;
    }
}