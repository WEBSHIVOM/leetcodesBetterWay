package src.main.java.array.smallercharthanatarget;

// Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

// Note that the letters wrap around.

// For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
public class SmallestCharthantarget {
    public char nextGreatestLetter(char[] letters, char target) {
     
        if (target < letters[0] || target >= letters[letters.length - 1]) {
               return letters[0];
           }
           int l=0;
            int r=letters.length-1;
            while(l<r){
                int mid=l+((r-l)/2);
                if(letters[mid]<=target){
                    l=mid+1;
                }else {
                    r=mid;
                }
            }
           return letters[l];
        }
   }

