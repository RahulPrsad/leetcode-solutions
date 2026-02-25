class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res=new ArrayList<>();
        for(String s:words){
            if(matches(s,pattern)){
                res.add(s);
            }
        }
        return res;
        
    }
    public boolean matches(String s,String pattern){
        if(s.length()!=pattern.length())return false;
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char p=s.charAt(i);
            char w=pattern.charAt(i);
            if(map1.containsKey(p) && map1.get(p)!=w){
                return false;
            }
            if(map2.containsKey(w) && map2.get(w)!=p){
                return false;
            }
            map1.put(p,w);
            map2.put(w,p);
        }
        return true;

    }
}