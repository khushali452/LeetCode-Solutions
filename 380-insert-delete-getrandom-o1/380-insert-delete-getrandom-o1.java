public class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> arr;
    
    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        arr = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }else {
            map.put(val, arr.size());
            arr.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }else {
            int key = map.get(val);
            int lastElement = arr.get(arr.size() - 1);
            map.put(lastElement, key);
            arr.set(key, lastElement);
            map.remove(val);
            arr.remove(arr.size() - 1);
            return true;
        }
    }
    
    public int getRandom() {
        Random random = new Random();
        return arr.get( random.nextInt(arr.size()) );
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */