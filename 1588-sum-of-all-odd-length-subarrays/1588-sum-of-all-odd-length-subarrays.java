class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0;
       for(int i=0;i<arr.length;i++){
           int count=(i+1)*(arr.length-i);
           if(count%2==1){
               count++;
           }
           res+=(count/2)*arr[i];
       } 
        return res;
    }
}