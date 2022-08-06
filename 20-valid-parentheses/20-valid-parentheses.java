class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk= new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ||s.charAt(i)=='{'||s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !stk.empty() && stk.peek() == '(')
                stk.pop();
            else if(s.charAt(i) == '}' && !stk.empty() && stk.peek() == '{')
                stk.pop();
            else if(s.charAt(i) == ']' && !stk.empty() && stk.peek() == '[')
                stk.pop();
            else 
                return false;
        }
        return stk.empty();
        
    }
}