package com.example.algorithms.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.FindDuplication.containsDuplicate;
import static org.junit.jupiter.api.Assertions.*;

class FindDuplicationTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void testContainsDuplicate(int[] nums, boolean expected) {
        boolean result = containsDuplicate(nums);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 1}, true),
                Arguments.of(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true),
                Arguments.of(new int[]{}, false),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, false)
        );
    }
}