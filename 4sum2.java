/* 
454. 4Sum II

Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:

0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 

Example 1:

Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
Output: 2
Explanation:
The two tuples are:
1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
Example 2:

Input: nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
Output: 1
 

Constraints:

n == nums1.length
n == nums2.length
n == nums3.length
n == nums4.length
1 <= n <= 200
-228 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 228
*/
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	Map<Integer,Integer> sums = new HashMap<>();
	int count = 0;
	for(int i=0; i<A.length;i++) {
		for(int j=0;j<B.length;j++){
			int sum = A[i]+B[j];
			if(sums.containsKey(sum)) {
				sums.put(sum, sums.get(sum)+1);
			} else {
				sums.put(sum, 1);
			}
		}
	}
	for(int k=0; k<A.length;k++) {
		for(int z=0;z<C.length;z++){
			int sum = -(C[k]+D[z]);
			if(sums.containsKey(sum)) {
				count+=sums.get(sum);
			}
		}
	}
	return count;
}
}