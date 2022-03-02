/* 
647. Palindromic Substrings

Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.*/
class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp= new boolean[s.length()][s.length()];
        int count=0;
        
        for (int gap=0;gap<s.length();gap++){
            for(int i=0,j=gap;j<dp.length;i++,j++){
                if(gap==0){
                    dp[i][j]=true;
                }else if(gap==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    if((s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true))
                        dp[i][j]=true;
                    else
                        dp[i][j]=false;
                }
                if(dp[i][j])
                count++;
            }
        }
        return count;
    }
}