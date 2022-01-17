/* 
367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        int start=2;
        int mid,end=num;
        if (num<2){
            return true;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if (mid==((float)num/mid)){
                return true;
            }
            else if (mid<(num/mid)){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}