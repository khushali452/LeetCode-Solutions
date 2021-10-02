class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n<3) return new ArrayList();
        
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        
        for(int i =0;i<n-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int j=i+1;
                int k=n-1;
                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if (sum==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<k && nums[j] == nums[j+1]) j++;
                        while(j<k && nums[k] == nums[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(sum>0) k--;
                    else j++;
                }
            }
        }
        return res;
    }
}