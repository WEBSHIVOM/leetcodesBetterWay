package src.main.java.max_problem.max_productOfSubarray;

public class MaxProductOfArray {
    public int max_Product_ofArray(int[] arr){
        int max_ending_her=arr[0];
        int min_ending_here=arr[0];
        int max_so_far=arr[0];

        for(int i=1;i<arr.length;i++){
            int tmp=Math.max(Math.max(arr[i],arr[i]*max_ending_her),arr[i]*min_ending_here);
            min_ending_here= Math.min(Math.min(arr[i],arr[i]*max_ending_her),arr[i]*min_ending_here);
            max_ending_her=tmp;
            max_so_far=Math.max(max_ending_her, min_ending_here);
        }
        return max_so_far;

    }
    public static void main(String[] args) {
        int[] arr = { 1, -2, 0,1 };
        
        System.out.println(new MaxProductOfArray().max_Product_ofArray(arr));
    }
}
