package src.main.java.array.kthLargestminArray;

import java.util.PriorityQueue;

public class kthLargMinPriorityqueue {
    
public static void findkthMaxs(int[] n,int k){
PriorityQueue<Integer> pq= new PriorityQueue<>();

for (int integer : n) {
    pq.add(integer);
    if(pq.size()>k){
        pq.poll();
    }
}
System.out.println(pq.poll());

}

public static void main(String[] args) {
    int[] n= {1,4,3,2,5,6,7,8,9,11,23};
   findkthMaxs(n,3);
}
}
