/* 
1704. Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
Example 3:

Input: s = "MerryChristmas"
Output: false
Example 4:

Input: s = "AbCdEfGh"
Output: true
 

Constraints:

2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.
*/
class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        int n=s.length()-1;
        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count1++;
            }
            if(s.charAt(n-i)=='a'||s.charAt(n-i)=='e'||s.charAt(n-i)=='i'||s.charAt(n-i)=='o'||s.charAt(n-i)=='u'||s.charAt(n-i)=='A'||s.charAt(n-i)=='E'||s.charAt(n-i)=='I'||s.charAt(n-i)=='O'||s.charAt(n-i)=='U'){
                count2++;
            }
        }
        if(count1==count2)
            return true;
        return false;
    }
}