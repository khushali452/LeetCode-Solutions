class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        l.add(1);
        ans.add(l);
        if(numRows==1)
          return ans;
        
        for(int row=2;row<=numRows;row++){
            List<Integer> prev=ans.get(row-2);
            List<Integer> nn=new ArrayList<>();
            nn.add(1);
            for(int i=0;i<prev.size()-1;i++){
                nn.add(prev.get(i)+prev.get(i+1));
            }
            nn.add(1);
            ans.add(nn);
        }
        return ans;
    }
}
