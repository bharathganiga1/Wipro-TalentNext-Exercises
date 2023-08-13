/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote. 

Input: ransomNote = "a", magazine = "b"
Output: false
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //creating a hashmap for magazine string
        HashMap <Character,Integer> magazine_map=doMap(magazine);
        for(int i=0;i<ransomNote.length();i++)
        {
            Character temp=ransomNote.charAt(i);
            //if character is present and key value is greater than 0 then decrement the key value by 1
            if(magazine_map.containsKey(temp) && magazine_map.get(temp)>0)
                magazine_map.put(temp,magazine_map.get(temp)-1);
            else
                //character not present
                return false;
        }
        return true;
    }
    //function to create a hashmap using string 
    public HashMap<Character,Integer> doMap(String str){
        HashMap <Character,Integer> indexMap=new HashMap<>();
        //iterate through each character
        for(int i=0;i<str.length();i++){
            //if it is already present increment the key value
            if(indexMap.containsKey(str.charAt(i))){
                indexMap.put(str.charAt(i),indexMap.get(str.charAt(i))+1);
            }
            //create a new entry to the hashmap
            else{
                indexMap.put(str.charAt(i),1);
            }
        }
        System.out.println(Arrays.asList(indexMap));
        return indexMap;
    }
}