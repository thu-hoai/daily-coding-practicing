package com.example.algorithms.grooking;

import java.util.*;

public class SlidingWindow {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {return 0;}

        char[] chars = s.toCharArray();
        int max = Integer.MIN_VALUE;
        int start = 0;
        List<Character> temp = new ArrayList<>();
        for (int end = 0; end < chars.length; end++) {
            char current = chars[end];
            if (temp.contains(current)) {
                start = temp.indexOf(current) + 1 + start;
                temp.removeIf(character -> temp.indexOf(character) <= temp.indexOf(current));
            }
            temp.add(chars[end]);
            max = Math.max(max, end - start + 1);
        }
        return max != Integer.MIN_VALUE ? max : 0;
    }

    public static int lengthOfLongestSubstringImproved(String s) {
        char[] chars = s.toCharArray();
        int max = Integer.MIN_VALUE;
        int start = 0;
        Map<Character, Integer> temp = new HashMap<>();
        for (int end = 0; end < chars.length; end++) {
            char current = chars[end];
            if (temp.containsKey(current)) {
                start = Math.max(start, temp.get(current) + 1);
            }

            temp.put(current, end);
            max = Math.max(max, end - start + 1);
        }
        return max != Integer.MIN_VALUE ? max : 0;
    }

    // Given a string, find the length of the longest substring in it with at most two distinct
    //characters.
    //ccaabbb -> 4, eceba -> 3
    public static int findLengthOfLongestSubstring(String string) {
        int atMost = 2;

        int max = Integer.MIN_VALUE;
        int left = 0;
        char[] chars = string.toCharArray();
        Map<Character, Integer> res = new HashMap<>() {};
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            res.put(character, res.getOrDefault(character, 1) + 1);

            if (res.size() > atMost) {
                if (res.get(character) > 1) {
                    res.put(character, res.get(character) - 1);
                } else {
                    res.remove(character);
                }
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    /**
     * https://leetcode.com/problems/fruit-into-baskets/description/
     */
    public static int totalFruit(int[] fruits) {

        int left = 0;
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> numsByType = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            numsByType.put(fruits[i], numsByType.getOrDefault(fruits[i], 0) + 1);
            while (numsByType.size() > 2) {
                int newNum = numsByType.get(fruits[left]) - 1;
                if (newNum == 0) {
                    numsByType.remove(fruits[left]);
                } else {
                    numsByType.put(fruits[left], newNum);
                }
                left ++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    /**
     * https://leetcode.com/problems/minimum-size-subarray-sum/
     * target = 7, nums = [2,3,1,2,4,3] -> 2
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int k = i;
            int sum = 0;
            while (sum < target && k <= n - 1) {
                sum += nums[k];
                k ++;
            }
            if (sum >= target) {
                min = Math.min(min, k - i);
            }
        }

        return Integer.MAX_VALUE == min ? 0 : min ;
    }

    /**
     * https://leetcode.com/problems/minimum-size-subarray-sum/
     * target = 7, nums = [2,3,1,2,4,3] -> 2
     */
    public static int minSubArrayLenSlidingWindow(int target, int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left ++;
            }
        }

        return Integer.MAX_VALUE == min ? 0 : min ;
    }

    /**
     * https://leetcode.com/problems/largest-subarray-length-k/
     */
    public static double findMaxAverage(int[] nums, int k) {
        // [1,12,-5,-6,50,3] k=4 -> 12.75
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - k + 1; i++) {
            double sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += nums[j];
            }
            double avg = sum / k;
            if (avg > max) {
                max = avg;
            }
        }
        return max;
    }

    /**
     * https://leetcode.com/problems/largest-subarray-length-k/
     */
    public static double findMaxAverageSlidingWindow(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int j = k; j < nums.length; j++) {
            sum = sum - nums[j - k] + nums[j];
            if (max < sum) {
                max = sum;
            }
        }
        return (double) max / k;
    }
}
