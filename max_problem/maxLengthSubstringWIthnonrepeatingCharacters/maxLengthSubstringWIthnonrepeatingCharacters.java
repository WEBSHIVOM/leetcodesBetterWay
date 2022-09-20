package max_problem.maxLengthSubstringWIthnonrepeatingCharacters;

import java.util.HashMap;

public class maxLengthSubstringWIthnonrepeatingCharacters {

    public int maxLength(String data) {
        HashMap<Character, Integer> map = new HashMap<>();
        String op = "";
        for (int start = 0, end = 0; end < data.length() - 1; end++) {
            char ch = data.charAt(end);
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch) + 1, start);
            }
            if (op.length() < end - start + 1) {
                op = data.substring(start, end + 1);
            }
            map.put(ch, end);
        }
        return op.length();

    }

    public static void main(String[] args) {
        System.out.println(new maxLengthSubstringWIthnonrepeatingCharacters().maxLength("ABCABCAA"));
    }
}
