package main.java.track_2025;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_cons=0;
        int max_so_far=0;
        int i=0;
        while (i< nums.length){
            if(nums[i]>0){
                max_cons+=1;
            }else max_cons=0;
            max_so_far=Math.max(max_cons, max_so_far);
            i++;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        FindMaxConsecutiveOnes findMaxConsecutiveOnes= new FindMaxConsecutiveOnes();
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}
