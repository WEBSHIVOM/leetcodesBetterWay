package src.main.java.codingPatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithUniqueKCharacters {

    public static int longestSubstringwithkCharacters(
            String input,
            int maxSubStringSize) {
        int window_start = 0;
        int maxLength = 0;
        Map<Character, Integer> distintCharMap = new HashMap<Character, Integer>();
        for (int window_end = 0; window_end < input.length(); window_end++) {
            Character rightChar = input.charAt(window_end);
            distintCharMap.put(rightChar, distintCharMap.getOrDefault(rightChar, 0) + 1);

            if (distintCharMap.size() > maxSubStringSize) {
                Character leftChar = input.charAt(window_start);
                distintCharMap.put(leftChar, distintCharMap.getOrDefault(leftChar, 0) - 1);
                if (distintCharMap.get(leftChar) == 0) {
                    distintCharMap.remove(leftChar);
                }
                window_start++;
            }
            maxLength = Math.max(maxLength, window_end - window_start + 1);
            //      System.out.println(">>>>>>>>"+window_start+"window ennd"+window_end);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestSubstringwithkCharacters(s, k));
    }
}