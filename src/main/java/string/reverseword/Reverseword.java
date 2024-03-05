package src.main.java.string.reverseword;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Reverseword {

    public String reverseWordsUsingStringOperations(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }

    public String reverseWordUsingStack(String s) {
        Stack<String> stack = new Stack<String>();

        for (String string : s.trim().split(" ")) {
            if (!string.isEmpty()) {
                stack.push(string);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        Reverseword rv = new Reverseword();
        System.out.println(rv.reverseWordsUsingStringOperations("Java is key of all"));

        // Java is key of all
        // 1
        // start=0 end =19

    }
}
