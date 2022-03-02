import java.lang.*;
class Solution {
    public String reversePrefix(String word, char ch) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == ch) {
                sb.append(word.substring(0, i+1));
                sb.reverse();
                
                sb.append(word.substring(i+1));
                
                return sb.toString();
                
            }
        }
        return word;
    }
}
