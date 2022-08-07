class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder str = new StringBuilder();
            str.append(words[i]);
            str.reverse();
            if(words[i].equals(str.toString())){
                return words[i];
            }
            
        }
        return "";
    }
}