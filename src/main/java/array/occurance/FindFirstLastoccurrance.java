package src.main.java.array.occurance;

/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.*/

public class FindFirstLastoccurrance {
    
    public int[] searchRange(int[] nums, int target) {
    return new int[]{findOccurance(nums, target, true),findOccurance(nums, target, false)};
    }

    public int findOccurance(int[] nums ,int target,boolean firstoccured){
        int l=0;
        int r=nums.length-1;
        int res=-1;
        while(l<=r){
        int mid=l+((r-l)/2);
        if(nums[mid]==target){
           res=mid;
           if(firstoccured)
           r=mid-1;
           else l=mid+1;
        }else if(nums[mid]<target){
            l=mid+1;
        }else{
            r=mid-1;
        }
    }
    return res;
        
    }
}
