import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if (s.length() > 0) {
        String[] arr = s.split("[ !,?.\\_'@]+");
        System.out.println(arr.length);
        for(String ar : arr) {
            System.out.println(ar);
        }
    } else {
        System.out.println(0);
    }
        scan.close();
    }
}

