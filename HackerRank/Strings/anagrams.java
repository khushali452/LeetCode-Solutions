import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
     a=a.toLowerCase();
        b=b.toLowerCase();
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);
        boolean status = java.util.Arrays.equals(chars1, chars2); 
        return status;   // Complete the function
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}