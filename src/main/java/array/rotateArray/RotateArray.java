package src.main.java.array.rotateArray;

/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. */
public class RotateArray {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9};
    RotateArray rotateArray= new RotateArray();
    rotateArray.rightRotate(arr,4);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}

public void rightRotate(int[] arr,int numOfTimes){
    numOfTimes%=arr.length;
    reverseArray(arr, 0, arr.length-1);
    reverseArray(arr, 0, numOfTimes-1);
    reverseArray(arr, numOfTimes, arr.length-1);
}


private void reverseArray(int[] arr,int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
}
