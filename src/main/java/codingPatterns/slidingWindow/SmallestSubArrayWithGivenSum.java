package src.main.java.codingPatterns.slidingWindow;

public class SmallestSubArrayWithGivenSum {

    /**
     * Given an array of positive integers nums and a positive integer target,
     * return the minimal length of a subArray
     * whose sum is greater than or equal to target.
     * If there is no such subArray, return 0 instead.
     *
     * @param arr input array
     * @param target given target
     * @return
     */
    public static int findSmallestSubArrayOfGivenSize(int[] arr, int target) {
        int window_start = 0;
        int window_sum = 0;
        int minLength = Integer.MAX_VALUE;
        // iterate through array starting from 0 ,for every iteration check if the given sum >= target
        //if yes then identify min length ,increase window start pointer value
        for (int window_end = 0; window_end < arr.length; window_end++) {
            window_sum += arr[window_end];
            while (window_sum >= target) {
                minLength = Math.min(minLength, window_end - window_start + 1);
                window_sum -= arr[window_start];
                window_start++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int k = 7;

        System.out.println(findSmallestSubArrayOfGivenSize(arr, k));
    }
}