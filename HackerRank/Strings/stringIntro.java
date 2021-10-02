import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int C= A.length() + B.length();
        System.out.println(C);
        String a1=A.substring(0,1).toUpperCase()+A.substring(1, A.length());
        String b1=B.substring(0,1).toUpperCase()+B.substring(1, B.length());
        int x=a1.compareTo(b1);
        if (x>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        System.out.println(a1+" "+b1);
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




