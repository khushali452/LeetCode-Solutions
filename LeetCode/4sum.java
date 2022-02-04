/* 
18. 4Sum

Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer> > set = new HashSet<>();
    Arrays.sort(nums);
    
    for(int i=0; i<nums.length-3; i++){
        for(int j=i+1; j<nums.length-2; j++){
            int left = j+1;
            int right = nums.length-1;
            
            while(left<right){
                int sum = nums[i]+nums[j]+nums[left]+nums[right];
                
                if(sum==target) {
                    set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                }
                
                else if(sum<target) left++;
                
                else if(sum>target) right--;
                
            }    
                
        }
                           
        }
    
    return new ArrayList<>(set);
    }
}