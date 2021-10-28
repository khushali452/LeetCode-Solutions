/* 
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 
*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        
        int i = 0;
        int j = 0 ;
        
        char ch1 = s.charAt(i);
        
        while(j<t.length()){
            char ch2 = t.charAt(j);
            
            if(ch1 == ch2){
                i++;
                if(i == s.length()){
                    return true;
                } 
                ch1 = s.charAt(i);
            }
            j++;
        }
        
        return false;
    }
}