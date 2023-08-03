package com.example.algorithms.leetcode;

public class SearchInsertPosition {

    /**
     * https://leetcode.com/problems/search-insert-position/description/
     */
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (i == 0 && target < nums[0]) return 0;
            if (i > 0 && target > nums[i - 1] && target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static int searchInsertBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (right >= left) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) return mid;
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
