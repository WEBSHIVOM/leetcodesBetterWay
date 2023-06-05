package src.main.java.array.kthLargestminArray;

import java.util.Arrays;

public class KTHlargeAndMin {
    
public static void findkthMaxMin(int[] n,int k){
    Arrays.sort(n);
   for (int i : n) {
       System.out.println(i);
   }
  System.out.println(n[n.length-k]);
  System.out.println(n[k-1]);
}

public static void main(String[] args) {
    int[] n= {1,4,3,2,5,6};
   findkthMaxMin(n,1);
}
}
