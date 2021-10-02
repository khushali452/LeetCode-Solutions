import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        Stack<Character> stack = new Stack<>();
        String s= A;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            stack.add(c);
        }
        StringBuilder sb = new StringBuilder("");
        
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            
        }
        String x = sb.toString(); 
        
        if(A.equals(x)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }      
        
        
        
    }
}



