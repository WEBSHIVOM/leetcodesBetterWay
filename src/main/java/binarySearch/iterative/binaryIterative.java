package src.main.java.binarySearch.iterative;

public class binaryIterative {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int index=Integer.MAX_VALUE;
        while(l<=r){
            int mid =l+(r-l)/2;
            
            if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]==target){
                index= mid;
                break;
            }
            
        }
        return index;
    }
}
