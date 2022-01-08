/* 
17. Letter Combinations of a Phone Number
Medium

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/
class Solution {
    List<String> res=new ArrayList<>();
    String[] phone={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
       populate(digits,"");
        return res;
    }
    public void populate(String digits,String s)
    {
        if(digits.length()==0){res.add(s);return;}
        int digit=Character.getNumericValue(digits.charAt(0))-2;
        for(int i=0;i<phone[digit].length();i++)
            populate(digits.substring(1),s+phone[digit].charAt(i));
    }
}