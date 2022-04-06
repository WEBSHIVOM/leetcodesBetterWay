package binarySearch.iterative.targetIndicesProblem;

import java.util.*;

/* You are given a 0-indexed integer array nums and a target element target.
A target index is an index i such that nums[i] == target.
Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
*/
public class TargetIndices {

    public List<Integer> targetIndices(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        Arrays.sort(nums);
        List<Integer> list= new ArrayList<>();
        while(l<=r){
            int mid=l+((r-l)/2);
            if(nums[mid]==target){
                list.add(mid);
            }else if(nums[mid]<target){
                l=mid+1;
                if(nums[l]==target){
                list.add(l);}
            }
            else {
                r=mid-1;
                if(nums[r]==target){
                list.add(r);}
            }
            
        }
        return list;
        
    }
    
}
