package array.peakelement;

public class binary_recursion {
    public static int findPeak(int[] n){
       return findBinaryWay(n,0,n.length-1);
    }

    private static int findBinaryWay(int[] n, int l, int r) {
        if(l==r){
            return l;
        }else{
            int mid=(l+r)/2;
            if(n[mid]>n[mid+1]){
                return findBinaryWay(n, l, mid);
            }else
            return findBinaryWay(n, mid+1, r);
        }
    }

    public static void main(String[] args) {
        int[] n={1,2,4,5,6,7,8,9};
        System.out.println(findPeak(n));
    } 
}
