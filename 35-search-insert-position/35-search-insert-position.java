class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=0;
        int start=0,end=nums.length-1;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            
        }
        return start;
    }
}