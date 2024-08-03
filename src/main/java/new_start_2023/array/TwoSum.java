package main.java.new_start_2023.array;

/*

Given an unsorted integer array, find a pair with the given sum in it.

• Each input can have multiple solutions. The output should match with either one of them.

Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists, the solution should return null.

Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: null

*/

import kotlin.Pair;

import java.util.*;

public class TwoSum
{
	/* The Pair<U, V> class have
		1. Two member variables, first and second.
		2. Factory method `Pair.of(U, V)` for creating its immutable instance.
		3. equals() and hashCode() methods overridden.
	*/

    public static Pair<Integer, Integer> findPair(int[] nums, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i]-target)){
                return new Pair<>(nums[i],nums[i]-target);
            }
            map.put(nums[i],i);
        }
        return new Pair<>(-1,-1);
    }
}

