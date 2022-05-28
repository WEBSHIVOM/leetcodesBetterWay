package top100.sortBinaryArrayInlinearWay;

public class sortUsingCount {
    public static void main(String[] args) {
        int[] A={1,0,1,0,1,0,0,1};
        sort(A);
    }

    private static void sort(int[] a) {

        int zeroes=0;

        for(int x:a){
            if(x==0){
                zeroes++;
            }
        }
        int k=0;
        while(zeroes-->0){
            a[k]=0;
            k++;
        }
        for(int i=k;i<a.length;i++){
            a[i]=1;
        }

        for(int i:a){
            System.out.println(i);
        }
    }
}
