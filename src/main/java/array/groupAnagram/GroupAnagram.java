package main.java.array.groupAnagram;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together.
 * <br>
 * You can return the answer in any order.
 * <br>
 * An Anagram is a word or phrase formed by rearranging the letters of
 * <br>
 * a different word or phrase, typically using all the original letters exactly once.
 * <br>
 * Example 1:
 * <br>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * <br>
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String object : strs) {
            char[] chars = object.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(object);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] ncalInput = new String[]{"", ""};

        groupAnagram.groupAnagrams(input);
    }
}
