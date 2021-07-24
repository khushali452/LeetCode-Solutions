public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers.length>=2)
        {
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            for(int i=0; i<numbers.length; i++){
                if(!h.isEmpty() && h.containsKey(target-numbers[i]))
                {
                    int[] k = {h.get(target-numbers[i]),i};
                    return k;
                }
                
                h.put(numbers[i],i);
            }
        }
        
        int[] k = {-1,-1};
        return k;
    }
}