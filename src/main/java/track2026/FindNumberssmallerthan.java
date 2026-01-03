package main.java.track2026;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindNumberssmallerthan {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
            map.put(nums[i],calculateTotalOccurrencesmallerThanCurrent(nums[i],nums));
        }
        int[] res= new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i]=map.get(nums[i]);
        }
        return res;
    }

    private Integer calculateTotalOccurrencesmallerThanCurrent(int num, int[] nums) {
        int i=0;
        for (int obj:nums){
            if(num > obj && num!=obj){
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        FindNumberssmallerthan findNumberssmallerthan= new FindNumberssmallerthan();
        int[] nums={8,1,2,2,3};
        Arrays.stream(findNumberssmallerthan.smallerNumbersThanCurrent(nums)).forEach(value -> System.out.println(value));
    }
}
