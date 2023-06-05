package src.main.java.array.missing;

public class missingvar {
    
    public static int getMissingNumber(int a[], int n){
        int x1=a[0];

        int x2=1;

        for (int i = 1; i < n; i++) {
            x1=x1^a[i];
        }
        for (int i = 2; i <= n+1; i++) {
            x2=x2^i;
        }

        return x1^x2;
    }
    public static void main(String[] args) {
        int[] n= {1,2,3,5,6};
        System.out.println(getMissingNumber(n,3));;
    }
}
