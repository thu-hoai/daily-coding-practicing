package com.example.algorithms.leetcode;

/**
 * https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string
 */
public class MinChangesBinaryString {

    public static int minOperationsFlip(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int flipCount = 1;
        char current = chars[0];
        char flipCurrent = flip(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (Character.getNumericValue(current) + Character.getNumericValue(chars[i + 1]) != 1) {
                current = flip(chars[i + 1]);
                count += 1;
            } else {
                current = chars[i + 1];
            }

            if (Character.getNumericValue(flipCurrent) + Character.getNumericValue(chars[i + 1]) != 1) {
                flipCurrent = flip(chars[i + 1]);
                flipCount += 1;
            } else {
                flipCurrent = chars[i + 1];
            }
        }
        return Math.min(flipCount, count);
    }

    public static int minOperations(String s) {
        char[] chars = s.toCharArray();
        int countStartWith0 = 0;
        int countStartWith1 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                if (chars[i] == '1') {
                    countStartWith0 += 1;
                } else {
                    countStartWith1 += 1;
                }
            } else {
                if (chars[i] == '0') {
                    countStartWith0 += 1;
                } else {
                    countStartWith1 += 1;
                }
            }
        }
        return Math.min(countStartWith1, countStartWith0);
    }

    private static char flip(char c) {
        return c == '1' ? '0' : '1';
    }
}
