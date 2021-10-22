class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str = new StringBuilder();
        for(int i =0;i<words.length;i++){
            str.append(words[i]);
            if((str.toString()).equals(s))
                return true;
        }
        return false;
    }
}