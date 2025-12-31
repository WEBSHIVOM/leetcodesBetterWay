package main.java.track_2025;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];

        int first_pointer=0;
        int second_pointer=n;
        int result=0;
        while (first_pointer < n){
            res[result++]=nums[first_pointer++];
            res[result++]=nums[second_pointer++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        ShuffleArray shuffleArray= new ShuffleArray();
        shuffleArray.shuffle(nums,n);
    }
}
