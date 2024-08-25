package main.java.array.longestconsecutivesequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers nums, return the length
 * of the longest consecutive elements sequence.
 * <br>
 * You must write an algorithm that runs in O(n) time.
 * <br>
 * Example 1:
 * <br>
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 * <br>
 * Example 2:
 * <p>
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 */
public class LongestConsecutiveSequnence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 101,102,103,104, 1, 3, 2,};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int ob : nums
        ) {
            set.add(ob);
        }


        int max = 0;
        for (int i = 0; i < nums.length; i++) {

            if (!set.contains(nums[i] - 1)) {
                int currentNum = nums[i];
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                max = Math.max(max, currentLength);
            }
        }
        return max;
    }
}
