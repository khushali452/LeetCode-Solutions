class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
	int result = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int j=i+1;
                int k=n-1;
                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    int diff = Math.abs(sum - target);
                    
                    if(diff == 0) return sum;
                    
                    if (diff < min) {
				min = diff;
				result = sum;
			}
			if (sum <= target) {
				j++;
			} else {
				k--;
                }
            }
    }
            
} 
        return result;
    }
}