package array.kthLargestminArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class kthsmallestelementMaxheap {
    public static void findkthMins(List<Integer> input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(input.subList(0, k));
 
        // do for remaining array elements
        for (int i = k; i < input.size(); i++)
        {
            // if the current element is less than the root of the heap
            if (input.get(i) < pq.peek())
            {
                // replace root with the current element
                pq.poll();
                pq.add(input.get(i));
            }
       }
       System.out.println("smallest is " + pq.peek());
    }

    public static void main(String[] args) {
        int[] n = { 1, 4, 3, 2, 5, 6, 7, 8, 9, 11, 23 };
        findkthMins(Arrays.stream(n).boxed().collect(Collectors.toList()), 1);
    }
}
