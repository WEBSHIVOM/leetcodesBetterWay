package top100.max_product;

public class max_productUsingMaxCalculation {
    public static void main(String[] args) {
        int[] A={-1,2,3,-4,6,7};
        max_product_method(A);
    }

    private static void max_product_method(int[] a) {

        int max_1=0; int max_2=Integer.MIN_VALUE;
        int min_1=0;int min_2=Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if(a[i]>max_1){
                max_2=max_1;
                max_1=a[i];
            }else if(a[i]>max_2){
                max_2=a[i];
            }
            if(a[i]<min_1){
                min_2=min_1;
                min_1=a[i];
            }else if(a[i]<min_2){
                min_2=a[i];
            }
        }
       int n=a.length-1;
        if(min_1*min_2<max_1*max_2){
              System.out.println("Pair is"+max_1+" &"+max_2);
        }else{
            System.out.println("Pair is"+min_1+" &"+min_2);
        }
    }
}
