import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap: key = sorted string, value = list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        //Loop through each word
        for (String s : strs) {
            //Convert string to char array to sort
            char[] chars = s.toCharArray();
            Arrays.sort(chars); //sort characters
            String sorted = new String(chars); //Convert back to String

            //If key doesn't exist, create a new list
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            //Add original string to the group
            map.get(sorted).add(s);
        }
        
        //Return all grouped lists
        return new ArrayList<>(map.values());
    }
}