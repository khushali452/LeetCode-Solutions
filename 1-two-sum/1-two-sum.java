public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                res[1]=i;
                res[0]=map.get(target-numbers[i]);
            }
            map.put(numbers[i],i);
        }
        return res;
    }
    
}