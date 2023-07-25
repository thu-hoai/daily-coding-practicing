package com.example.algorithms;


public class RemoveDuplicateSortedArray {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i == 0 || nums[i - 1] != num) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}
