class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]= s.split(" ");
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<k;i++){
            str.append(arr[i]+" ");
            
        }
        return str.toString().trim();
    }
}