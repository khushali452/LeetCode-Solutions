 /* 
 763. Partition Labels

You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Return a list of integers representing the size of these parts.

 

Example 1:

Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
Example 2:

Input: s = "eccbbbbdec"
Output: [10]
 

Constraints:

1 <= s.length <= 500
s consists of lowercase English letters.
 */
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> arr= new ArrayList<>();
        int start=0,charac=0;
        
        int[] last = new int[26];
        for (int i = 0; i < s.length(); ++i)
            last[s.charAt(i) - 'a'] = i;
        
        for(int i=0;i<s.length();++i){
            start=Math.max(start,last[s.charAt(i)-'a']);
            if(i==start){
                arr.add(i-charac+1);
                charac=i+1;
            }
        }
       return arr; 
    }
}