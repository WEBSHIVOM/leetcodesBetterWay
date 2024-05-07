package src.main.java.array.countSortOrRadixSortORDUTCHFLAG;

public class CountSort {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 2, 2, 0 };
        countSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    private static void countSort(int[] arr) {
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
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
