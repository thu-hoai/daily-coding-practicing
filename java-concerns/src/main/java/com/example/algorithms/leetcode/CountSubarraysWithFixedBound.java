package com.example.algorithms.leetcode;

/**
 * Count Subarrays With Fixed Bounds
 * https://leetcode.com/problems/count-subarrays-with-fixed-bounds/?envType=daily-question&envId=2024-03-31
 */
public class CountSubarraysWithFixedBound {

    /**
     * You are given an integer array nums and two integers minK and maxK.
     * <p>
     * A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
     * <p>
     * The minimum value in the subarray is equal to minK.
     * The maximum value in the subarray is equal to maxK.
     * Return the number of fixed-bound subarrays.
     * <p>
     * A subarray is a contiguous part of an array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
     * Output: 2
     * Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].
     * Example 2:
     * <p>
     * Input: nums = [1,1,1,1], minK = 1, maxK = 1
     * Output: 10
     * Explanation: Every subarray of nums is a fixed-bound subarray. There are 10 possible subarrays.
     */
    public static int countSubarrays(int[] nums, int minK, int maxK) {
        int res = 0;
        int k = -1; // tracking the index of the most recent number that's outside the range [minK, maxK]
        int minKIndex = -1; // tracking the index of the last number that is equal to minK
        int maxKIndex = -1; // tracking the index of the last number that is equal to maxK

        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            if (num < minK || num > maxK)
                k = i;
            if (num == minK)
                minKIndex = i;
            if (num == maxK)
                maxKIndex = i;
            res += Math.max(0, Math.min(minKIndex, maxKIndex) - k);
        }

        return res;
    }

    public static int countSubarraysTest(int[] arr, int min, int max) {
        int n = arr.length;
        int count = 0;

        for (int start = 0; start < n; start++) {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;

            for (int end = start ; end < n; end++) {

                minVal = Math.min(minVal, arr[end]);
                maxVal = Math.max(maxVal, arr[end]);

                if (minVal < min) break;
                if (maxVal > max) break;

                if (minVal == min && maxVal == max) {
                    count++;
                }
            }
        }

        return count;
    }

}
