class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        int cnt=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==d)
                cnt++;      
                
        }
        if(cnt==arr.length-1)
            return true;
        return false;
    }
}