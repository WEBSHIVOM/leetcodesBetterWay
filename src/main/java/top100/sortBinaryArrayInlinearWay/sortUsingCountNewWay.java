package src.main.java.top100.sortBinaryArrayInlinearWay;

public class sortUsingCountNewWay {
    public static void main(String[] args) {
        int[] A={1,0,1,0,1,0,0,1};
        sort(A);
    }

    private static void sort(int[] a) {
        int index=0;
        for(int j=0;j<a.length;j++){
            if(a[j]==0){
                a[index++]=0;
                
            }
        }
        for(int k=index;k<a.length;k++){
            a[k]=1;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
