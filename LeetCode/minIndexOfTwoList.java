class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        // Using HashMap to record each element and their indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> rst = new ArrayList<>();
        int minSum = Integer.MAX_VALUE, sum;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                sum = i + map.get(list2[i]);
                // If this sum is lesser than the minimum sum
                // clear the result list and add the list2[i] into the rst list
                if (sum < minSum) {
                    rst.clear();
                    rst.add(list2[i]);
                    minSum = sum;
                // If the sum is equal to the minimum sum
                // we put an extra entry corresponding to the element list2[i] in the rst list.
                } else if (sum == minSum) {
                    rst.add(list2[i]);
                }
            }
        }

        return rst.toArray(new String[rst.size()]);
    }
}
