class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
	for (int n : nums) {
		if (!set.add(n))
			set.remove(n);
	}
	Iterator<Integer> it = set.iterator();
	return it.next();
        
    }
}