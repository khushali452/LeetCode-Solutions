/* 
438. Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 

Constraints:

1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
*/
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         p = sortString(p);
	
	// define sliding window size
    int left = 0;
    int right = p.length()-1;

    List<Integer> answer = new ArrayList();

    while(right < s.length()){

        String current = sortString(s.substring(left, right+1));
        if (current.equals(p)){
            answer.add(left);
			// if we find a match, we wanna keep comparing 
			//we compare the next character (right+1) with the first (left), if they are equal, 
			// means next subString is also a match. Break out of the while loop until we find different
            while (right < s.length()-1 && s.charAt(right+1) ==  s.charAt(left)){
                answer.add(left+1);
                left++;
                right++;
            }
        }

        left++;
        right++;
    }

    return answer;

}

private static String sortString(String s1) {

    char[] c = s1.toCharArray();
    Arrays.sort(c);

    return new String(c);
    }
}