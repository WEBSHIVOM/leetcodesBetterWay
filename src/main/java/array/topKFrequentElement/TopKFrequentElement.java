package main.java.array.topKFrequentElement;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Given an integer array nums and an integer k,
 * <br>
 * return the k most frequent elements. You may return the answer in any order.
 * <br>
 *
 * <br>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <br>
 * Input: nums = [1], k = 1
 * Output: [1]
 */
public class TopKFrequentElement {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Object[] arr = map.entrySet().stream()
                .filter(e -> e.getValue() >= k)
                .map(Map.Entry::getKey)
                .toArray();

        int[] ars = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ars[i] = (int) arr[i];
        }
        return ars;
    }

    public static void main(String[] args) {
        TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
        int[] nums =new int[]{1};
        int k = 1;
        for (Integer ojk : topKFrequentElement.topKFrequent(nums, k)) {
            System.out.println(ojk);
        }
    }
}
