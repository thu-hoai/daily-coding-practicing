package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void maxProductTest(int[] input, int expectedOutput) {
        assertEquals(expectedOutput, MaxProduct.maxProduct(input));
    }

    public static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(new int[] {3,4,5,2}, 12),
                Arguments.of(new int[] {1,5,4,5}, 16),
                Arguments.of(new int[] {3, 7}, 12)
        );
    }
}
