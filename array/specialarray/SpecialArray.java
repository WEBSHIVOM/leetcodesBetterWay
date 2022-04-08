package array.specialarray;

import java.util.Arrays;

public class SpecialArray {
   
        public int specialArray(int[] nums) {
            Arrays.sort(nums);
            int l=0;
            int r=nums.length-1;
            while(l<=r){
                int mid=l+((r-l)/2);
                if(nums[mid]>=nums.length-mid){
                    if(mid==0 || nums[mid-1]<nums.length-mid){
                        return nums.length-mid;
                    }else{
                        r=mid-1;
                    }
                }else{
                    l=mid+1;
                }
            }
            return -1;
        }
    
}
