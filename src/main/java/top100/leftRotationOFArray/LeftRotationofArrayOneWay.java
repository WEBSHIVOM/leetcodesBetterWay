package src.main.java.top100.leftRotationOFArray;

import java.util.Arrays;

public class LeftRotationofArrayOneWay {
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
 
        leftRotate(A, k);
 
        System.out.println(Arrays.toString(A));
    }

    private static void leftRotate(int[] a, int k) {

        if(k< 0 || k >=a.length){
            return;
        }
        for( int i=0;i<k;i++){
            leftRotateArrayByOne(a);
        }
    }

    private static void leftRotateArrayByOne(int[] a) {
           int first=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=first;
    }
}
