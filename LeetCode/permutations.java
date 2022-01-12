/* 
46. Permutations

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
*/

//bactrackin Approach
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list; 
        
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> temp, int [] nums){
        if (temp.size()==nums.length){
            list.add(new ArrayList(temp));//if the the temp list equals nums length then add to resultant list
            }else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i]))
                    continue;
                temp.add(nums[i]);//Add the current traversing element from nums
                backtrack(list, temp, nums);//Backtrack to its previous node by calling backtrack function recursively
                temp.remove(temp.size()-1);//remove the last element of the temp to find another way from the prev node which we got ofter backtracking 
            }
        }
    }
    
}