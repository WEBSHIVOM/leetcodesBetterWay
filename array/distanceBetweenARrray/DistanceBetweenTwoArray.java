
package array.distanceBetweenARrray;

import java.util.Arrays;

public class DistanceBetweenTwoArray {
    
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int res=0;

        for(int i=0;i<arr1.length;i++){
            int closest=findClosest(arr2,arr1[i]);
            if(Math.abs(arr1[i]-closest)>d){
                res=res+1;
            }
        }
        return res;
    }

    private int findClosest(int[] arr2, int target) {
        int d=Integer.MAX_VALUE;
        int l=0;
        int r=arr2.length-1;

        while(l<=r){
            int mid=l+((r-l)/2);
            if(arr2[mid]==target){
                return arr2[mid];
            }else if(arr2[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
            d=Math.abs(target-arr2[mid])<Math.abs(target-d)?arr2[mid]:d;
            
        }
        return d;
    }

}
