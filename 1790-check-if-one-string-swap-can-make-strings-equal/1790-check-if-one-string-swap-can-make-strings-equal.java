class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt=0;
        
        String s = s1;
        char[] c = s.toCharArray();        // convert to array of chars 
        java.util.Arrays.sort(c);          // sort
        String newString = new String(c); 
        
        String st = s2;
        char[] d = st.toCharArray();        // convert to array of chars 
        java.util.Arrays.sort(d);          // sort
        String newString1 = new String(d); 
        
        if(newString.equals(newString1)){
            for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                cnt++;            
            }
            if(cnt==2||cnt==0)
                return true;
            return false;
            }
            
        else{
            return false;            
        }     
                       
    }
}