/* 
128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hset=new HashSet<Integer>();
        for(int num:nums){
            hset.add(num);
        }
        int max=0;
        for(int num:hset){
            if(!hset.contains(num-1)){
                int curr_num=1;
                int curr_count=1;
                
                while(hset.contains(curr_num+1)){
                    curr_num++;
                    curr_count++;
                }
                max=Math.max(max,curr_count);
            }
        }
        return max;
    }
}