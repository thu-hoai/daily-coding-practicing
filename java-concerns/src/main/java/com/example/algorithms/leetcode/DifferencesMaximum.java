package com.example.algorithms.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs
 */
public class DifferencesMaximum {

    public static int maxProductDifferenceBySortedApproach(int[] nums) {
        int[] sortedArr = Arrays.stream(nums).sorted().toArray();
        return (sortedArr[sortedArr.length - 1] * sortedArr[sortedArr.length - 2])
                - (sortedArr[0] * sortedArr[1]);
    }

    public static int maxProductDifference(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;

        int biggest = 0;
        int maxSecond = 0;

        for (int num : nums) {
            if (num > biggest) {
                maxSecond = biggest;
                biggest = num;
            } else {
                if (num > maxSecond) {
                    maxSecond = num;
                }
            }
            if (num < smallest) {
                minSecond = smallest;
                smallest = num;
            } else {
                if (num < minSecond) {
                    minSecond = num;
                }
            }
        }

        return (maxSecond * biggest) - (minSecond * smallest);
    }
}
