class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] arr;
        arr= s.toCharArray();
        int index;
        char[] farr=new char[arr.length];
        for(int i = 0; i <arr.length;i++){
            index= indices[i];
            farr[index]=arr[i];
        }
        String res = String.copyValueOf(farr);
        return res ;
    }
}