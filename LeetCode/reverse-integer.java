class Solution {
    public int reverse(int x) {
        long num = x;
        boolean neg = false;
        if(num<0){
            num = 0 - num;
            neg = true ;
        }
        
        long result = 0;
        while(num != 0){
            result *=10;
            result += num %10;
            num /= 10;
        }
        if(result > Integer.MAX_VALUE) 
            return 0;
        return neg ? 0 - ((int)result): (int)result;
    }
}
