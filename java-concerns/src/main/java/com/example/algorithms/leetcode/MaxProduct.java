package com.example.algorithms.leetcode;

public class MaxProduct {

    /**
     * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
     * Choose two different indices i and j of that array.
     * @param nums the array of integers nums
     * Constraints: 2 <= nums.length <= 500; 1 <= nums[i] <= 10^3
     * @return the maximum value of (nums[i]-1)*(nums[j]-1).
     */
    public static int maxProduct(int[] nums) {
        int first = nums[0];
        int second = 0;
        for (int i=1; i< nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
            } else {
                if (nums[i] > second) {
                    second = nums[i];
                }
            }
        }
        return (first-1) * (second - 1);
    }
}
