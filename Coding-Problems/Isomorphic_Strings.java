/**Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.
Input: s = "egg", t = "add"
Output: true
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>dict=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(dict.containsKey(a)){
                if(!dict.get(a).equals(b))
                    return false;
            } 
            else{
                if(!dict.containsValue(b))
                    dict.put(a,b);
                else
                    return false;
            }
        } 
        return true; 
    }

}