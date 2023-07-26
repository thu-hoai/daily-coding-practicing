package com.example.algorithms;

public class RemoveElement {

    /**
     * https://leetcode.com/problems/remove-element/description/
     */
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}
