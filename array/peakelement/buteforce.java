package array.peakelement;

public class buteforce {
    
    public static int findPeak(int[] n){
        for(int i=0;i<n.length-1;i++){
            if(n[i]>n[i+1]){
                return i;
            }
        }
        return n.length-1;
    }

    public static void main(String[] args) {
        int[] n= {1,4,3,2,5,6,7,8};
        System.out.println(findPeak(n));
    }
}
