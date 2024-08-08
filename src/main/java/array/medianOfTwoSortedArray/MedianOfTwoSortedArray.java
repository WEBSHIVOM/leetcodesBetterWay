package main.java.array.medianOfTwoSortedArray;

import java.util.Arrays;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively,
 return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianOfTwoSortedArray {

    public double findMedianSortedArraysBruteForceWay(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[k++] = nums2[i];
        }
        Arrays.sort(merged);

        int totalLength = merged.length;

        if (totalLength % 2 == 1) {
            return (double) merged[totalLength / 2];
        } else {
            int middle1 = merged[(totalLength - 1) / 2];
            int middle2 = merged[totalLength / 2];
            return (double) (middle2 + middle1) / 2.0;
        }

    }

    public double findMedianSortedArraysOptimizedWay(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[n];
        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        // If there are remaining elements in nums1
        while (i < n1) {
            mergedArray[k++] = nums1[i++];
        }

        // If there are remaining elements in nums2
        while (j < n2) {
            mergedArray[k++] = nums2[j++];
        }

        int totalLength = mergedArray.length;

        if (totalLength % 2 == 1) {
            return (double) mergedArray[totalLength / 2];
        } else {
            int middle1 = mergedArray[(totalLength - 1) / 2];
            int middle2 = mergedArray[totalLength / 2];
            return (double) (middle2 + middle1) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3}, nums2 = {2};
        MedianOfTwoSortedArray medianOfTwoSortedArray = new MedianOfTwoSortedArray();
        double result = medianOfTwoSortedArray.findMedianSortedArraysOptimizedWay(nums1, nums2);

        System.out.print("result>>>>>>>>>>>>>");
        System.out.println(result);
    }

}