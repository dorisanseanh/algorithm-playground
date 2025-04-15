package com.leetcode.hashmap;

import java.util.HashMap;

public class TwoSum {
    /*
     * Given an integer array and a target, return indices of two numbers
     * that add up to the target. Only one valid answer exists.
     *
     * Example:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1] // because 2 + 7 = 9
     *
     */
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution") ;
}

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

    }

}
