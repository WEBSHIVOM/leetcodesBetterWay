package src.main.java.max_problem.maxSubArraywithLargestSum;

public class maxSubArraywithLargestSum {
    public static void main(String[] args) {  
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArraywithhighestSum(arr));
    }

    private static int maxSubArraywithhighestSum(int[] nums) {
        int curval=nums[0];
        int maxval=nums[0];
        for(int i=1;i<nums.length;i++){
            if(curval>0){
                curval=curval+nums[i];
            }
            else{
                curval=nums[i];
            }
            maxval=Math.max(curval,maxval);
        }
        return maxval;
    }
}
