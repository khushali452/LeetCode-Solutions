class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String reverseword="";
        for(String w:arr)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseword=reverseword+sb.toString()+" ";
        }
        return reverseword.trim();
        
    }
}