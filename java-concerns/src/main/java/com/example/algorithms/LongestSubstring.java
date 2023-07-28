package com.example.algorithms;

import java.util.*;

public class LongestSubstring {

    /**
     * https://leetcode.com/problems/longest-substring-without-repeating-characters/
     */
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder temp = new StringBuilder();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            // Check if the current character already exists in the `temp`.
            // If it is not present, add to `temp`
            // If presented, update starting position of the sliding window (left)
            // to the next position after the first occurrence of the repeating character
            // and update the substring
            int k = temp.toString().indexOf(s.charAt(right));
            if (k != -1) {
                maxLength = Math.max(maxLength, temp.length());
                left += k + 1;
                temp = new StringBuilder(s.substring(left, right + 1));
                continue;
            }
            temp.append(s.charAt(right));
        }
        return Math.max(maxLength, temp.length());
    }

    public static int lengthOfLongestSubstringHashSet(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int n = s.length();

        Set<Character> charSet = new HashSet<>();

        while (right < n) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstringMap(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;

        Map<Character, Integer> charIndexes = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (charIndexes.containsKey(currentChar)) {
                left = Math.max(charIndexes.get(currentChar) + 1, left);
            }
            maxLength = Math.max(maxLength, right - left + 1);
            charIndexes.put(currentChar, right);
        }

        return maxLength;
    }
}
