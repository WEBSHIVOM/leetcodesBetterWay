package main.java.array.kthLargestminArray;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueMaxMin {

    public int findKthMax(List<Integer> numbers , int k){
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
        for (Integer nums: numbers){
            priorityQueue.add(nums);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();
    }

    public int findKthMin(List<Integer> numbers , int k){
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>(numbers);

        while (--k>0){
            priorityQueue.poll();
        }
        return priorityQueue.poll();
    }

    public static void main(String[] args) {
        PriorityQueueMaxMin priorityQueueMaxMin= new PriorityQueueMaxMin();
      //  System.out.println(priorityQueueMaxMin.findKthMax(List.of(4,1,2,3,4,5,6),2));
        System.out.println(priorityQueueMaxMin.findKthMin(List.of(4,1,2,3,4,5,6),2));
    }
}
