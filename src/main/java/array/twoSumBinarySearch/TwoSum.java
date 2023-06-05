package src.main.java.array.twoSumBinarySearch;

/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice. */
class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int ans = -1;
        for (int i = 0; i < numbers.length; i++) {
            ans = binarySearch(numbers, target - numbers[i]);
            if (ans != -1)
                return new int[] { ++i, ++ans };
        }
        return new int[] { -1, -1 };
    }

    public int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (mid < r && arr[mid] == arr[mid + 1] && arr[mid] == x) {
                return mid + 1;
            }
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}