class Solution {
    public String[] findWords(String[] words) {
        String a = "qwertyuiopQWERTYUIOP";
        String b = "asdfghjklASDFGHJKL";
        String c = "zxcvbnmZXCVBNM";
        
        HashSet<Character> x = new HashSet<Character>();
        for(int i =0 ; i<a.length();i++){
            x.add(a.charAt(i));
        }
        HashSet<Character> y = new HashSet<Character>();
        for(int i =0 ; i<b.length();i++){
            y.add(b.charAt(i));
        }
        HashSet<Character> z = new HashSet<Character>();
        for(int i =0 ; i<c.length();i++){
            z.add(c.charAt(i));
        }
        
        ArrayList<String> str = new ArrayList<String>();
        for(int j=0 ;j < words.length;j++){
            String curr = words[j];
            int t1=0;
            int t2=0;
            int t3=0;
            for(int i=0;i<curr.length();i++){
                if(x.contains(curr.charAt(i))){
                    t1++;
                }
                else if(y.contains(curr.charAt(i))){
                    t2++;
                }
                else if(z.contains(curr.charAt(i))){
                    t3++;
                }
            }
            if((t1==curr.length())||(t2==curr.length())||(t3==curr.length())){
                str.add(curr);
            }
            
            
        }
        String finl[]= new String[str.size()];
            for(int i =0;i<str.size();i++){
                finl[i]=str.get(i);
            }
        return finl;
    }
}
