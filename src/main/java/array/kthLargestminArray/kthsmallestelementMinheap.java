package src.main.java.array.kthLargestminArray;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class kthsmallestelementMinheap {
    public static void findkthMins(List<Integer> n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(n);
        while (--k > 0) {
            pq.poll();
        }
        System.out.println("smallest is " + pq.poll());
    }

    public static void main(String[] args) {
        int[] n = { 1, 4, 3, 2, 5, 6, 7, 8, 9, 11, 23 };
        findkthMins(Arrays.stream(n).boxed().collect(Collectors.toList()), 2);
    }
}
