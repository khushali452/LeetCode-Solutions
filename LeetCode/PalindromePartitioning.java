/* 
131. Palindrome Partitioning

Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
*/
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<List<String>>();
        backtrack(0,res,new ArrayList<String>(),s);
        return res;
    }
    void backtrack(int start, List<List<String>> res,List<String> curr_list,String s){
        if(start >=s.length())
            res.add(new ArrayList<String> (curr_list));
        for(int end = start; end < s.length(); end++){
            if(isPalindrome(s,start,end)){
                curr_list.add(s.substring(start,end+1));
                backtrack(end+1,res,curr_list,s);
                curr_list.remove(curr_list.size()-1);
            }
        }
    }
     boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
}
}