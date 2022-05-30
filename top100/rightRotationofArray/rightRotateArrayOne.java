package top100.rightRotationofArray;

import java.util.Arrays;

public class rightRotateArrayOne {
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rightRotate(A, k);
        System.out.println(Arrays.toString(A));
    }

    private static void rightRotate(int[] a, int k) {

        if(k< 0 || k >=a.length){
            return;
        }
        for( int i=0;i<k;i++){
            rightRotateArrayByOne(a);
        }
    }

    private static void rightRotateArrayByOne(int[] a) {
           int last=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0]=last;
    }
}
