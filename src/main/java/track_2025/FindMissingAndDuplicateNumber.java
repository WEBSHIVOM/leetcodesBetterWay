package main.java.track_2025;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMissingAndDuplicateNumber {

    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int on:nums){
            map.put(on, map.getOrDefault(on, 0)+1);
        }
        int[] res= new int[2];
        for (int i = 0; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    res[0] = i; // Assign the duplicate number (value)
                }
            } else {
                res[1] = i; // Assign the missing number (value)
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        FindMissingAndDuplicateNumber findMissingAndDuplicateNumber= new FindMissingAndDuplicateNumber();
        System.out.println(Arrays.toString(findMissingAndDuplicateNumber.findErrorNums(nums)));
    }
}
