package array.majorityElement_easy;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > (nums.length / 2)) {
                res = nums[i];
                break;
            }
        }
        return res;
    }

}
