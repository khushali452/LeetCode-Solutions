/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely" 
*/

class Solution {
    public String toLowerCase(String s) {
        char[] arr= s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i]=(char)(arr[i]+32);
            }
        }
        return String.valueOf(arr);
    }
}