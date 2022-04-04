package array.repeatingElements;

import java.util.HashSet;
import java.util.Set;

public class firstRepeatingElement {
    public static void firstrepeatinge(int[] nums){
        Set<Integer> set= new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
           if(set.add(nums[i])==false){
              System.out.println(nums[i]); 
           }
       }
    }

    public static void main(String[] args) {
        int[] n= {1,1};
        firstrepeatinge(n);
    }
}
