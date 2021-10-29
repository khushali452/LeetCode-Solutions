/*
There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle with a pointer. A character can only be typed if the pointer is pointing to that character. The pointer is initially pointing to the character 'a'.


Each second, you may perform one of the following operations:

Move the pointer one character counterclockwise or clockwise.
Type the character the pointer is currently on.
Given a string word, return the minimum number of seconds to type out the characters in word.

 

Example 1:

Input: word = "abc"
Output: 5
Explanation: 
The characters are printed as follows:
- Type the character 'a' in 1 second since the pointer is initially on 'a'.
- Move the pointer clockwise to 'b' in 1 second.
- Type the character 'b' in 1 second.
- Move the pointer clockwise to 'c' in 1 second.
- Type the character 'c' in 1 second.
Example 2:

Input: word = "bza"
Output: 7
Explanation:
The characters are printed as follows:
- Move the pointer clockwise to 'b' in 1 second.
- Type the character 'b' in 1 second.
- Move the pointer counterclockwise to 'z' in 2 seconds.
- Type the character 'z' in 1 second.
- Move the pointer clockwise to 'a' in 1 second.
- Type the character 'a' in 1 second.
 */

class Solution {
    public int minTimeToType(String word) {
        int ans = 0; int hey = 0;
	     int k  = 0;
         
	     for(int i=0; i<word.length(); i++) {
	    	 char c = word.charAt(i);
	         	k = Math.abs(a - c);
				
	    	 if(k <= 13) {
	    		 hey = k+1;
	    	 }
	    	 else {
	    		 hey = (26 - k)+1;
	    	 }
             ans += hey;
             a = c;   
	     }
	    
	     return ans;
    }
}

