package src.main.java.array.subarraywithequalZerosndOne;

import java.util.*;

public class ewqualZeroandOne {
    static int countSubarrWithEqualZeroAndOne(int[] arr,
            int n) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
            sum += arr[i];
            if (sum == 0) {
                count++;
            }
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return count;
    }

    // main function
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
        System.out.println(
                "Count = "
                        + countSubarrWithEqualZeroAndOne(arr, n));
    }
}
