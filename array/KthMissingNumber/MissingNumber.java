package array.KthMissingNumber;
public class MissingNumber {
    public int findKthPositive(int[] arr, int k) {
        int res=-1;
        for (int i = 1; i < 10000+k; i++) {
            if(k==0){
                break;
            }else{
                if(!binarySearch(arr, i)){
                    
                    res=i;
                    k--;
                }
            }
        }
        return res;
    }


     // find number arr[i] - i - 1 
     public int findKthPositiveAnotherWay(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int mValue = arr[m] - m - 1;
            if(mValue >= k) {
                r = m - 1;
            } else if(mValue < k) {
                l = m + 1;
            }
        }
        return k + l;
    }


    public boolean binarySearch(int[] arr,int x){
        int l=0;
        int r= arr.length-1;
        while(l<=r){
            int mid=l+((r-l)/2);
            if(arr[mid]==x){
                return true;
            }else if(arr[mid]<x){
                    l=mid+1;
                }
            else{
                r=mid-1;
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        MissingNumber ms= new MissingNumber();
        int[] arr={2,3,4,7,11};
        System.out.println(ms.findKthPositive(arr, 5));;
    }
}
