/* 
2165. Smallest Value of the Rearranged Number

You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.

Return the rearranged number with minimal value.

Note that the sign of the number does not change after rearranging the digits.

 

Example 1:

Input: num = 310
Output: 103
Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 310. 
The arrangement with the smallest value that does not contain any leading zeros is 103.
Example 2:

Input: num = -7605
Output: -7650
Explanation: Some possible arrangements for the digits of -7605 are -7650, -6705, -5076, -0567.
The arrangement with the smallest value that does not contain any leading zeros is -7650.
 

Constraints:

-1015 <= num <= 1015
*/
class Solution {
    public long smallestNumber(long num) {
         if(num == 0){
            return 0;
        }
        boolean negative = false;
        if(num<0){
            negative = true;
            num *= -1;
        }
        
        String snum = Long.toString(num);
        int len = snum.length();
        int[] numArr = new int[len];
        
        for(int i=0; i<len; i++){
            numArr[i] = snum.charAt(i) - '0';
        }
        long ans = 0;
        Arrays.sort(numArr);
        if(numArr[0] == 0 && !negative){
            boolean check = true;
            int index = 0;
            while(check){
                if(numArr[index] == 0){
                    index++;
                }
                else{
                    break;
                }
            }
            numArr[0] = numArr[index];
            numArr[index] = 0;
        }
        
        if(!negative){
            for(int i=0; i<len; i++){
                ans = (ans*10) + numArr[i];
            }    
        }
        else{
            for(int i=len-1; i>=0; i--){
                ans = (ans*10) + numArr[i];
            }   
        }
        return ans = negative ? ans*-1 : ans;
    }
}