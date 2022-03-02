class Solution {
    public int[] shortestToChar(String s, char c) {
        
        
           
            int[] left=new int[s.length()];
            int[] right=new int[s.length()];
             Arrays.fill(left,Integer.MAX_VALUE);
            Arrays.fill(right,Integer.MAX_VALUE);
            
            int dist = Integer.MAX_VALUE;
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    dist=0;
                    left[i]=dist;
                    
                }else{
                    if(dist != Integer.MAX_VALUE){
                        dist++;
                        left[i]=dist;
                    }
                }
            }
        dist= Integer.MAX_VALUE;
        
        for(int j=s.length()-1;j>=0;j--){
                if(s.charAt(j)==c){
                    dist=0;
                    right[j]=dist;
                    
                }else{
                    if(dist != Integer.MAX_VALUE){
                        dist++;
                        right[j]=dist;
                    }
                }
            }
        int[] ans=new int[s.length()];
        for(int k=0;k<s.length();k++){
            ans[k]=Math.min(left[k],right[k]);
        }
        
        return ans;
    }
}