package new_start_2023.array;

import java.util.stream.IntStream;

public class FindPivotElement {

    public int pivotIndex(int[] nums) {
        int total_left = 0;
        int total_right = IntStream.of(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            total_right=total_right-nums[i];
            if(total_left==total_right){
                return i;
            }
            total_left=total_left+nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotElement fp= new FindPivotElement();
        int[] data={-1,-1,0,1,1,0};
        
        System.out.println(fp.pivotIndex(data));
    }
}
