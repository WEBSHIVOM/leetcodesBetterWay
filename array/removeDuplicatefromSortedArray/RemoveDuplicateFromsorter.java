package array.removeDuplicatefromSortedArray;

public class RemoveDuplicateFromsorter {
    /*Remove Duplicates from Sorted Array(no duplicates) :*/

public int removeDuplicates(int[] nums) {
    int i = 0;
    for(int n : nums)
        if(i < 1 || n > nums[i - 1]) 
            nums[i++] = n;
    return i;
}
/*Remove Duplicates from Sorted Array II (allow duplicates up to 2): */

public int removeDuplicateswith2duplicates(int[] nums) {
   int i = 0;
   for (int n : nums)
      if (i < 2 || n > nums[i - 2])
         nums[i++] = n;
   return i;
}

public int removeDuplicateswithKduplicates(int[] nums,int k) {
    int i = 0;
    for (int n : nums)
       if (i < k || n > nums[i - k])
          nums[i++] = n;
    return i;
 }

 public static void main(String[] args) {
    int[] arr={0,1,1,2,2,2,3,3,3,3,3,4,4,4};
    System.out.println(new RemoveDuplicateFromsorter().removeDuplicateswithKduplicates(arr,1));
 }


}
