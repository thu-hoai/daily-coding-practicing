package com.example.algorithms;

import java.util.Arrays;

import static java.lang.Math.min;

public class LongestCommonPrefix {
    /**
     * https://leetcode.com/problems/longest-common-prefix/description/
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = getCommonPrefixBetweenTwoString(prefix, strs[i]);
        }
        return prefix;
    }

    public static String longestCommonPrefix3(String[] strs) {
        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            StringBuilder result = new StringBuilder();
            String word = strs[i];
            int j = 0;
            while (j < word.length() && j < pre.length()) {
                if (word.charAt(j) != pre.charAt(j)) {
                    break;
                }
                result.append(word.charAt(j));
                j += 1;
            }
            pre = result.toString();
        }
        return pre;
    }

    public static String longestCommonPrefix1(String[] strs) {

        String result = "";
        Arrays.sort(strs);

        int j = 0;
        while (j < strs[0].length()) {
            if (strs[0].charAt(j) == strs[strs.length - 1].charAt(j)) {
                result += strs[0].charAt(j);
                j++;
            } else {
                return result;
            }
        }
        return result;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            while (word.indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) return "";
            }
        }
        return pre;
    }

    public static String getCommonPrefixBetweenTwoString(String str1, String str2) {
        while (str2.indexOf(str1) != 0) {
            str1 = str1.substring(0, str1.length() - 1);
            if (str1.isEmpty()) return "";
        }
        return str1;
    }
}
