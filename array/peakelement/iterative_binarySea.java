package array.peakelement;

public class iterative_binarySea {
    public static int findPeak(int[] nums){
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] n= {1,4,3,2,544,6,10,8};
        System.out.println(findPeak(n));
    }
}
