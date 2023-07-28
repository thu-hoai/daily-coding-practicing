package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.LongestSubstring.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

    @ParameterizedTest
    @MethodSource("inputExpected")
    void testFindLengthOfLongestSubstring(String input, int expectedInt) {
        int actual = lengthOfLongestSubstring(input);
        assertEquals(expectedInt, actual);
    }

    @ParameterizedTest
    @MethodSource("inputExpected")
    void testFindLengthOfLongestSubstringHashSet(String input, int expectedInt) {
        int actual = lengthOfLongestSubstringHashSet(input);
        assertEquals(expectedInt, actual);
    }

    @ParameterizedTest
    @MethodSource("inputExpected")
    void testFindLengthOfLongestSubstringMap(String input, int expectedInt) {
        int actual = lengthOfLongestSubstringMap(input);
        assertEquals(expectedInt, actual);
    }

    private static Stream<Arguments> inputExpected() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("dvdf", 3),
                Arguments.of("abcdbaecd", 5),
                Arguments.of("anviaj", 5),
                Arguments.of("", 0),
                Arguments.of(" ", 1),
                Arguments.of("pwwkew", 3)
        );
    }
}
