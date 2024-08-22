package main.java.array.topKFrequentElement;

import java.util.*;

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
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            maxHeap.add(entry);
        }
        List<Integer> result= new ArrayList<>();
        while(result.size()<k){
          result.add(maxHeap.poll().getKey());
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
        int[] nums =new int[]{1,2};
        int k = 2;
        for (Integer ojk : topKFrequentElement.topKFrequent(nums, k)) {
            System.out.println(ojk);
        }
    }
}
