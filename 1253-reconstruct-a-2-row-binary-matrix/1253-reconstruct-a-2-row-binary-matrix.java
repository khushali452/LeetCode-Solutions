class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> res = new ArrayList();
        //check number of 2-s in colsum
        int t = 0;
        for (int n : colsum) {
            if (n == 2 ) ++t;
        }
        List<Integer> up = new ArrayList(), down = new ArrayList();
        //decrement number of 2s from upper and lower so it contribution reserved
        upper-=t;
        lower-=t;
        //check every number in colsum in greedy manner starting from the upper
        for (int n : colsum) {
            //start from 0, it covers case when n == 0
            int x = 0, y = 0;
            //if sum for the col is 2 the only way to get it is to make up and low both 1
            if (n == 2) {
                x = y = 1;
            } else if (n == 1) {
                //if it's 1 it means only one from up/lower is 1. Start from upper always
                if (upper > 0) {
                    --upper;
                    x = 1;
                    y = 0;
                } else {
                    --lower;
                    x = 0;
                    y = 1;
                }
            }
            //check if we out of limits 
            if (upper < 0 || lower < 0)
                return res;
            //add number to upper and lower rows
            up.add(x); down.add(y);
        }
        //check if we have used exact number for each row sum
        if (lower == 0 && upper == 0) {
            res.add(up); res.add(down);
        }
        return res;
    }
}