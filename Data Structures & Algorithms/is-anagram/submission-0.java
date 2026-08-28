class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        char[] ch=s.toCharArray();
        char[] ch2=t.toCharArray();
        for(char i:ch){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(char j:ch2){
            map2.put(j, map2.getOrDefault(j,0)+1);
        }
        if(map.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }
}
