package main.java.sort.mergeSort;

import java.util.Arrays;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int[] arr={121,1,1,2,41,21242,323,121,21,21,2,12,12,141213212,12};

        mergeSortBasics(arr,0,arr.length-1);
    }

    private static void mergeSortBasics(int[] arr, int left, int right) {

        if(left<right){
            int mid= (left+right)/2;
            //sort left
            mergeSortBasics(arr, left, mid);
            //sort right
            mergeSortBasics(arr,mid+1,right);
            mergeArray(arr,left,mid,right);
            for (int oo:arr
                 ) {
                System.out.println(oo);
            }
        }
    }

    private static void mergeArray(int[] arr, int left, int mid, int right) {

        int[] arrLeft= Arrays.copyOfRange(arr,left,mid+1);
        int[] arrRight= Arrays.copyOfRange(arr,mid+1,right+1);

        int k=left;
        int i=0;
        int j=0;
       while(i< arrLeft.length && j< arrRight.length){
           if(arrLeft[i]<= arrRight[j]){
               arr[k++]=arrLeft[i++];
           }else{
               arr[k++]=arrRight[j++];
           }
       }
       while (i<arrLeft.length){
           arr[k++]=arrLeft[i++];
       }
        while (j<arrLeft.length){
            arr[k++]=arrLeft[i++];
        }
    }

}
