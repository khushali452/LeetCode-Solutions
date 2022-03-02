/* 
525. Contiguous Array


Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int sum=0,longest_subarray=0;
        
        for(int i=0;i<nums.length;i++){
            sum+= nums[i]==0?-1:1;
            
            if(sum==0){
                if(longest_subarray<i+1)
                    longest_subarray=i+1;
                
            }else if(map.containsKey(sum)){
                longest_subarray=Math.max(longest_subarray,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return longest_subarray;
    }
}