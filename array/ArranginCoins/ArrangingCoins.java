package array.ArranginCoins;
/* https://leetcode.com/problems/arranging-coins/description/

You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Givenn, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer. */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int lo = 1, hi = n, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (mid * (mid + 1L) <= n * 2L) lo = mid + 1;
            else hi = mid - 1;
        }
        return hi;
    }

}
