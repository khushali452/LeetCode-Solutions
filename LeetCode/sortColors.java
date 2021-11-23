/* 
75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]
Example 4:

Input: nums = [1]
Output: [1]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is 0, 1, or 2.
 

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/
class Solution {
    public void sortColors(int[] nums) {
         if (nums == null || nums.length <= 1) {
            return;
        }

        int zeros = 0;
        int twos = nums.length - 1;
        int i = 0;

        while (i <= twos) {
            if (nums[i] == 0) {
                swap(nums, i, zeros);
                zeros++;
                // Can increment i. As only 0s and 1s are present between zero and i.
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, twos);
                twos--;
                // Cannot increment i. The number at i can now be a zero.
            } else {
                // Its a one.. so we do not need to move it.
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}