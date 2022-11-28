package array.maxlengthwordsMadefromgivenChar;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthString {
    /*
     * You are given an array of strings words and a string chars.
     * 
     * A string is good if it can be formed by characters from chars (each character
     * can only be used once).
     * 
     * Return the sum of lengths of all good strings in words.
     */
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charmap = new HashMap<>();

        char[] ch = chars.toCharArray();
        int res = 0;
        for (int i = 0; i < ch.length; i++) {
            charmap.put(ch[i], charmap.getOrDefault(ch[i], 0) + 1);
        }

        for (String c : words) {
            HashMap<Character, Integer> datamap = new HashMap<>();
            int i = 0;
            for (; i < c.length(); i++) {
                if (charmap.containsKey(c.charAt(i))) {
                    if (datamap.containsKey(c.charAt(i)) && datamap.get(c.charAt(i)) + 1 > charmap.get(c.charAt(i))) {
                        break;
                    }
                    datamap.put(c.charAt(i), charmap.getOrDefault(c.charAt(i), 0) + 1);
                } else {
                    break;
                }
            }

            if (i == c.length())
                res += c.length();

        }
        return res;
    }

    public static void main(String[] args) {
        String[] word={"hello","world","leetcode"
      
       };
        String words=   "welldonehoneyr";

        System.out.println(new MaxLengthString().countCharacters(word, words));

    }
}
