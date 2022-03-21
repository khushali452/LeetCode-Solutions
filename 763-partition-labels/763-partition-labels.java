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