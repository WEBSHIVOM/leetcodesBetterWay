package array.occurance;

public class totaltOccurrence {
    public static void main(String[] args)
    {
        int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
 
        int firstOccuredindex = findallccurrence11(nums, target,true);
         int lastOccuredIndex=findallccurrence11(nums, target, false);
        if (firstOccuredindex != -1 && lastOccuredIndex !=-1)
        {
            System.out.println("The total occurrence of element " + target +
                            " is  " + (lastOccuredIndex-firstOccuredindex+1));
        }
        else {
            System.out.println("Element not found in the array");
        }
    }

    private static int findallccurrence11(int[] nums, int target,boolean searchFirst) {
        int left = 0;
        int right = nums.length - 1;
 
        // initialize the result by -1
        int result = -1;
 
        // loop till the search space is exhausted
        while (left <= right)
        {
            // find the mid-value in the search space and compares it with the target
            int mid = (left + right) / 2;
 
            // if the target is located, update the result and
            // search towards the left (lower indices)
            if (target == nums[mid])
            {
                result = mid;
                if(searchFirst){
                    right = mid - 1;
                }else{
                    left=mid+1;
                }
                
            }
 
            // if the target is less than the middle element, discard the right half
            else if (target < nums[mid]) {
                right = mid - 1;
            }
 
            // if the target is more than the middle element, discard the left half
            else {
                left = mid + 1;
            }
        }
 
        // return the leftmost index, or -1 if the element is not found
        return result;
    }
}
