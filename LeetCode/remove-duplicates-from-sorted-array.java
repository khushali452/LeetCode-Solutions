class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr2 = new int[nums.length];
        int j =0;
        if(nums.length > 0){
            
        for (int i=0;i< nums.length - 1;i++){
            if (nums[i] != nums[i+1])
                arr2[j++] = nums[i];
        }
        arr2[j++]=nums[nums.length - 1];
        for (int i=0; i<j; i++)
            nums[i] = arr2[i];
         return j;
    }else{
        return nums.length;
    }
    
    }
}
