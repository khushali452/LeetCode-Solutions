class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if (numbers == null || numbers.length == 0)
		return null;
        
        
        int i=0;
        int j=numbers.length -1;
        
        int sum;
        while(i<j){
            sum = numbers[i]+numbers[j];
            if(sum<target){
                i++;                
            }
            else if(sum>target) j--;
            
                    else return new int[] { i + 1, j + 1 };;
        }
        return null;
    }
}