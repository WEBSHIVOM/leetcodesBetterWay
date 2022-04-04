package array.reverseArray;

import java.util.ArrayList;
import java.util.List;

public class reverseNAIVE {
    public static void findreverse(int[] nums){
        List<Integer> list= new ArrayList<>();
         for (int i = nums.length-1; i>0; i--) {
             list.add(nums[i]);
         }
         for (int i : list) {
             System.out.println(i);
         }
    }

    public static void main(String[] args) {
        int[] n= {1,4,3,2,544,6,10,8};
        findreverse(n);
    }
}
