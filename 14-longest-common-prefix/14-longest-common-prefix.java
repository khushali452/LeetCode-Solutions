class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        Arrays.sort(strs);
        int cnt=0;
        while(cnt<strs[0].length()){
            if(strs[0].charAt(cnt)==strs[strs.length-1].charAt(cnt)){
                cnt++;
            }else{
                break;
            }
        }
        return cnt == 0 ? "" : strs[0].substring(0, cnt);
    }
}