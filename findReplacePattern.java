
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        ArrayList<String> res= new ArrayList<String>();
        for (int i=0;i<words.length;i++){
            if(match(words[i],pattern)){
                res.add(words[i]);
            }
           
        }
        
        return res;
    }
    private boolean match(String word,String pattern){
           HashMap<Character,Character> mymap = new HashMap<Character,Character>();
        boolean res = true;
        for(int i=0;i<pattern.length();i++){
            char schar = pattern.charAt(i);
            char tChar = word.charAt(i);
            if(!mymap.containsKey(schar)){
                 if(mymap.values().contains(tChar)) //same character is being mapped to two chars 
                     return false;
                 mymap.put(schar,tChar);
                
            }else{                
                    if(tChar != mymap.get(schar)){
                        return false;                   
                }
                
            }
                           
        }
        return true;
        }
}