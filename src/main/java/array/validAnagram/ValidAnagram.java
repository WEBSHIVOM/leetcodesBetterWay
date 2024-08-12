package main.java.array.validAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] chars1=s.toCharArray();
        Arrays.sort(chars1);
        char[] chars2=t.toCharArray();
        Arrays.sort(chars2);
        return Arrays.compare(chars1,chars2)==0;
    }

    public boolean isAnagramUsingMap(String s, String t) {
        char[] chars1=s.toCharArray();
        char[] chars2=t.toCharArray();
        Map<Character,Integer> map =  new HashMap<>();

        return Arrays.compare(chars1,chars2)==0;
    }
}
