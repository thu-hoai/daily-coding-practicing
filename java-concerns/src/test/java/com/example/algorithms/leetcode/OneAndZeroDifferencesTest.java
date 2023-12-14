package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OneAndZeroDifferencesTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void onesMinusZerosTest(int[][] input, int[][] expectedOutput) {
        assertArrayEquals(expectedOutput, OnesAndZeros.onesMinusZerosO3(input));
        assertArrayEquals(expectedOutput, OnesAndZeros.onesMinusZeros(input));
    }

    public static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {0, 1, 1},
                        {1, 0, 1},
                        {0, 0, 1}
                }, new int[][]{
                        {0, 0, 4},
                        {0, 0, 4},
                        {-2, -2, 2}
                }),
                Arguments.of(new int[][]{
                        {1, 1, 1},
                        {1, 1, 1}
                }, new int[][]{
                        {5, 5, 5},
                        {5, 5, 5}
                })
        );
    }
}
