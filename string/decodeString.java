package string;

import java.util.Stack;

public class decodeString {
    public String decode(String s1) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s1.toCharArray()) {
            if (ch != ']') {
                stack.push(ch);
            } else {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek()))
                    sb.insert(0, stack.pop());
                //
                String remain = sb.toString();
                // remove [
                stack.pop();

                // now get number
                sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek()))
                    sb.insert(0, stack.pop());

                int count = Integer.valueOf(sb.toString());

                // NOW REPEAT AS PER COUNT
                while (count > 0) {
                    for (char ch1 : remain.toCharArray()) {
                        stack.push(ch1);
                    }
                    count--;
                }
            }
        }

        StringBuilder sbrev= new StringBuilder();
        while(!stack.isEmpty()){
            sbrev.insert(0, stack.pop());
        }

        return sbrev.toString();
    }
    public static void main(String[] args) {
        decodeString s1= new decodeString();
        System.out.println(s1.decode("2[A3[ASDAS]]"));
    }
}
