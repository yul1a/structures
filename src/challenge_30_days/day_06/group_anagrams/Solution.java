package challenge_30_days.day_06.group_anagrams;

import java.util.*;

/*
Group Anagrams
Given an array of strings, group anagrams together.
Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0){
            return new ArrayList<List<String>>();
        }

        if (strs.length == 0){
            List<List<String>> result= new ArrayList<List<String>>();
            List<String> r1 = new ArrayList<>();r1.add(strs[0]);
            result.add(r1);
            return new ArrayList<List<String>>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else {
                List<String> same = new ArrayList<>();
                same.add(s);
                map.put(key, same);
            }
        }
        List<List<String>> result= new ArrayList<List<String>>();
        for (Map.Entry<String, List<String>> i: map.entrySet()){
            result.add(i.getValue());
        }
        return result;
    }
}
