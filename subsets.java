/* 
78. Subsets

Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
*/

//Iterative Approach
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList()); //Adding Empty List to Output Array
        for (int i =0;i<nums.length;i++){
            int n= output.size(); 
            
            //only runs as the size of elements present in output array list
            for(int j=0;j<n;j++){
                
                //copy the element os output list to temp list
                List<Integer> temp=new ArrayList(output.get(j));
                //adds the current traversing element from the nums array to the temp array elements 
                temp.add(nums[i]);
                
                //adds the temp array added with current traversing element of nums to the output array
                output.add(temp);
            }
        }
        return output;
    }
}