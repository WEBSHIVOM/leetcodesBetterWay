package top100.max_product;

import java.util.Arrays;

public class maxProductSor {
    public static void main(String[] args) {
        int[] A={-1,2,3,-4,6,7};
        max_product_method(A);
    }

    private static void max_product_method(int[] a) {

        if(a.length<2){
            return; 
        }

        Arrays.sort(a);
       int n=a.length-1;
        if(a[0]*a[1]<a[n-1]*a[n]){
              System.out.println("Pair is"+a[n-1]+" &"+a[n]);
        }else{
            System.out.println("Pair is"+a[0]+" &"+a[1]);
        }
    }
}
