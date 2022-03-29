class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int [] candidates, int remain, int start){
        if(remain<0)
            return;
        else if(remain==0)
            list.add(new ArrayList<>(temp));
        else{
            for(int i=start;i<candidates.length;i++){
                if(i>start && candidates[i]==candidates[i-1])
                    continue;
                temp.add(candidates[i]);
                backtrack(list, temp, candidates, remain - candidates[i], i+1); 
                temp.remove(temp.size()-1);
            }
        }
    }
}