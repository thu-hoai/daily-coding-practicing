package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferencesMaximumTest {

    public static Stream<Arguments> inputExpectedMaxDifference() {
        return Stream.of(
                Arguments.of(new int[]{5, 6, 2, 7, 4}, 34),
                Arguments.of(new int[]{2, 9, 5, 9, 1}, 79),
                Arguments.of(new int[]{1, 6, 7, 5, 2, 4, 10, 6, 4}, 68),
                Arguments.of(new int[]{10, 10, 10, 10}, 0),
                Arguments.of(new int[]{4, 2, 5, 9, 7, 4, 8}, 64)
        );
    }

    @ParameterizedTest
    @MethodSource("inputExpectedMaxDifference")
    void maxProductDifferenceTest(int[] input, int expected) {
        assertEquals(expected, DifferencesMaximum.maxProductDifferenceBySortedApproach(input));
        assertEquals(expected, DifferencesMaximum.maxProductDifference(input));
    }
}
