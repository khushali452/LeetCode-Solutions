/* 
22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8

*/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res,new StringBuilder(),0,0,n);
        return res;
    }
    public void backtrack(List<String> res, StringBuilder cur, int open, int close, int max){
        if(cur.length()==max*2){
            res.add(cur.toString());
            return;
        }
        if(open<max){
            cur.append("(");
            backtrack(res, cur, open+1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(close < open) {
            cur.append(")");
            backtrack(res, cur, open, close+1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}