package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryMatrixTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void numSpecialTest(int[][] input, int expectedOutput) {
        assertEquals(expectedOutput, BinaryMatrix.numSpecial(input));
    }

    public static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1, 0, 0},
                        {0, 0, 1},
                        {1, 0, 0}
                }, 1),
                Arguments.of(new int[][]{
                        {1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}
                }, 3),
                Arguments.of(new int[][]{
                        {0, 1, 0},
                        {0, 0, 0},
                        {1, 0, 0},
                        {1, 0, 0}
                }, 1)
        );
    }
}
