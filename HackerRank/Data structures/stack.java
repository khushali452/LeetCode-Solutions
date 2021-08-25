import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
while (sc.hasNext()) {
     String input=sc.next();
     Stack<Character> stack = new Stack<>();
     for (int i = 0; i < input.length(); i++) {
        if (!stack.isEmpty()) {
            switch(input.charAt(i)) {
                case '}' : if (stack.peek() == '{') {
                    stack.pop();
                } break;
                case ']' : if (stack.peek() == '[') {
                    stack.pop();
                } break;
                case ')' : if (stack.peek() == '(') {
                    stack.pop();
                } break;
                default: stack.push(input.charAt(i));
          }
        } else {
            stack.push(input.charAt(i));
        } 
     }
     System.out.println(stack.isEmpty());
  }
		}
		
	}



