/* 
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
            int n1= nums1.length;
            int n2= nums2.length;
            
            int i=0;
            int j=n1;
//partition partx and party should be such that total no. of elements in it are exactly half of the total number of elements of both array as we will get median nearly around that middle elements of combined sorted array 
            while(i<=j){
                int partx=(i+j)/2;
                int party=(n1+n2+1)/2 -partx;
                
                int maxLeftX=(partx==0)?Integer.MIN_VALUE : nums1[partx-1];
                int minRightX= (partx==n1)?Integer.MAX_VALUE: nums1[partx];
                
                int maxLeftY = (party==0)?Integer.MIN_VALUE :nums2[party-1];
                int minRightY= (party==n2)?Integer.MAX_VALUE: nums2[party];

                if(maxLeftX<= minRightY && maxLeftY <=minRightX){
                    if((n1+n2)%2 == 0){
                        return ((double)Math.max(maxLeftX,maxLeftY)+Math.min(minRightX, minRightY))/2;
                        
                    }else{
                        return (double)Math.max(maxLeftX, maxLeftY);
                    }
                }
                
                else if(maxLeftX>minRightY){
                        j=partx-1;
                }else{
                        i=partx +1;
                    }
                }
        throw new IllegalArgumentException();
            }
        
    }
