class Solution {
    public String getSmallestString(int n, int k) {
        char[] c= new char[n];
        for(int i=0;i<n;i++){
            c[i]='a';
            k--;
        }
        int curr=0;
        while(k>0){
            curr=Math.min(25,k);
            n--;
            c[n]+=curr;
            k-=curr;
        }
        return String.valueOf(c);
    }
}