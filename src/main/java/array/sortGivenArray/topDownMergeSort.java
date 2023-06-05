package src.main.java.array.sortGivenArray;

import java.util.*;
public class topDownMergeSort {
    public static List<Integer> sortArray(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        mergeSort(nums, 0, nums.length - 1);
        for (int i : nums) res.add(i);
        return res;
    }

    private static void mergeSort(int[] nums, int l, int r) {
        int mid =l+(l-r)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums,l,r);
    }

    private static void merge(int[] nums, int l, int r) {
        
    }
}
