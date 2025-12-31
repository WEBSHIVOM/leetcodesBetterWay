package main.java.array.countSortOrRadixSortORDUTCHFLAG;

public class CountSort {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 01, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0,1, 1, 2, 2, 2, 2, 2, 2, 0 };
        countSort(arr);
        System.out.println("bUBBLE");
        bubbleSort(arr);

    }

    private static void bubbleSort(int[] arr){
        long start = System.nanoTime();


            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length-1; j++) {
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }


        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) + " ms");

    }

    private static void countSort(int[] arr) {
        long startTime = System.nanoTime();
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int pivot = 1;
        while (mid <= end) {
            if (arr[mid] < pivot) {
                swap(arr, start, mid);
                ++start;
                ++mid;
            } else if (arr[mid] > pivot) {
                swap(arr, mid, end);
                --end;
            } else {
                ++mid;
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");

    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
