package src.main.java.array.countSortOrRadixSortORDUTCHFLAG;

import java.util.Arrays;

public class sort012 {
    
    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
 
    public static void main (String[] args)
    {
        int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
 
        threeWayPartition(A);
        System.out.println(Arrays.toString(A));
    }

    private static void threeWayPartition(int[] a) {
        int start=0;
        int pivot=1;
        int end=a.length-1;
        int mid=0;

        while(mid<=end){
            if(a[mid]<pivot){
                swap(a, start, mid);
                ++start;
                ++mid;
            }else if(a[mid]>pivot){
                swap(a, mid,end);
                --end;
            }else {
                ++mid;
            }
        }
    }
}
