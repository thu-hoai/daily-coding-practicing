package com.example.algorithms.leetcode;

import com.example.algorithms.leetcode.LongestCommonPrefix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    @Test
    @DisplayName("Should return the longest common prefix for given array of strings using longestCommonPrefix method")
    void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = LongestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return the longest common prefix for given array of strings using longestCommonPrefix1 method")
    void longestCommonPrefix1() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = LongestCommonPrefix.longestCommonPrefix1(strs);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return the longest common prefix for given array of strings using longestCommonPrefix2 method")
    void longestCommonPrefix2() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = LongestCommonPrefix.longestCommonPrefix2(strs);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return the longest common prefix for given array of strings using longestCommonPrefix3 method")
    void longestCommonPrefix3() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = LongestCommonPrefix.longestCommonPrefix3(strs);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return the common prefix between two given strings")
    void getCommonPrefixBetweenTwoString() {
        String prefix = LongestCommonPrefix.getCommonPrefixBetweenTwoString("flower", "flow");
        assertEquals("flow", prefix);

        prefix = LongestCommonPrefix.getCommonPrefixBetweenTwoString("flower", "flight");
        assertEquals("fl", prefix);

        prefix = LongestCommonPrefix.getCommonPrefixBetweenTwoString("flower", "rose");
        assertEquals("", prefix);
    }

}