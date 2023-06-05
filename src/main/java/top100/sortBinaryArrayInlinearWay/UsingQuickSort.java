package src.main.java.top100.sortBinaryArrayInlinearWay;

public class UsingQuickSort {
    public static void main(String[] args) {
        int[] A={1,0,1,0,1,0,0,1};
        sort(A);
    }

    private static void sort(int[] a) {

        int pivot=1;
        int j=0;

        for(int i=0;i<a.length;i++){
            if(a[i]<pivot){
                swap(a,i,j);
                j++;
            }
        }

        for(int x:a){
            System.out.println(x);
        }
    }

    private static void swap(int[] a, int i, int j) {
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
    }

    
}
