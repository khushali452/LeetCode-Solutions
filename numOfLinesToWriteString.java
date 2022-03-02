
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] res ={1,0};
        for(char c: s.toCharArray()){
            int length = widths[c - 'a'];
            if(res[1]+length > 100){
                res[0]+=1;
                res[1]=length;
            }else{
                res[1]+=length;
                    
            }
        }
        return res;
    }
}