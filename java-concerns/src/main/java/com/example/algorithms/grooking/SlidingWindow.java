package com.example.algorithms.grooking;

public class SlidingWindow {



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
