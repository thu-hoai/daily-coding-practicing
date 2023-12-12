package com.example.algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindDuplication {

    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int num : nums) {
            if (temp.contains(num)) {
                return true;
            } else {
                temp.add(num);
            }
        }
        return false;
    }
}
