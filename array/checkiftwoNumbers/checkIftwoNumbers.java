package array.checkiftwoNumbers;

import java.util.HashSet;

public class checkIftwoNumbers {
    public boolean judgeSquareSum(int c) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <= Math.sqrt(c); i++) {
            set.add(i * i);
            if (set.contains(c - i * i)) {
                return true;
            }
        }
        return false;
    }
}
