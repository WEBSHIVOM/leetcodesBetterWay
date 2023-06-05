package src.main.java.array.occurance;

public class findlastOccurrence {
    public static void main(String[] args)
    {
        int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 6;
 
        int index = findlastOccurrence11(nums, target);
 
        if (index != -1)
        {
            System.out.println("The last occurrence of element " + target +
                            " is located at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }

    private static int findlastOccurrence11(int[] nums, int target) {
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
                left = mid + 1;
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
