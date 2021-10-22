class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet();
        for(int num : nums1) set1.add(num);
        List<Integer> ans = new LinkedList<Integer>();
        
        for(int num : nums2){
           if(set1.contains(num)){
                ans.add(num);   
				
				// remove from set so as to not get into the loop.
                set1.remove(num);
           }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
}