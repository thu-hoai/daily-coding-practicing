package com.example.algorithms.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return String.valueOf(str1).equals(String.valueOf(str2));
    }
}
