class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<Character>();
        
        for(char st : s.toCharArray()){
            
            if((st== '(' )||( st=='{' )|| (st=='[')){
                str.push(st);
            }
            else{
                if(str.empty()){
                    return false;
                }
                else{
                    char top = (Character) str.peek();
                    if(st == ')' && top == '(' ||
          st == '}' && top == '{' ||
          st == ']' && top == '['){
                        str.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        
        if(str.empty()){
            return true;
        }else{
            return false;
        }
    }
}
