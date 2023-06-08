package org.example.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers @param nums and @param integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arrayPositions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if(arrayPositions.containsKey(remainder)){
                return new int[] {i, arrayPositions.get(remainder)};
            }
            arrayPositions.put(nums[i], i);
        }
        return null;
    }
}
