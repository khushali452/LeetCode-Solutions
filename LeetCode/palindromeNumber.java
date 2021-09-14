class Solution {
    public boolean isPalindrome(int x) {
        int y,n,res=0;
        n=x;
        
        if (x < 0)
			return false;
        
        while(x>0){
            y = x %10;
            x=x/10;
            res = res*10 + y;
                  
        }        
        if(n==res)    
           return true;   
        else    
           return false;    
    }
}