class RandomizedCollection {

    List<Integer> nums;
    Map<Integer, Set<Integer>> map;
    Random random;

    public RandomizedCollection() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        boolean response = !map.containsKey(val);

        if (response) {
            map.put(val, new HashSet<>());
        }
        map.get(val).add(nums.size());
        nums.add(val);

        return response;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        Set<Integer> idxSet = map.get(val);
        int idxToBeRemoved = idxSet.iterator().next();
        if (idxSet.size() == 1) {
            map.remove(val);
        } else {
            idxSet.remove(idxToBeRemoved);
        }

        int lastIdx = nums.size() - 1;
        if (idxToBeRemoved != lastIdx) {
            int lastVal = nums.get(lastIdx);
            Set<Integer> lastIdxSet = map.get(lastVal);
            lastIdxSet.add(idxToBeRemoved);
            lastIdxSet.remove(lastIdx);
            nums.set(idxToBeRemoved, lastVal);
        }

        nums.remove(lastIdx);

        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}