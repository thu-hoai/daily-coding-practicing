package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ImageSmootherTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void isAnagramTest(int[][] input, int[][] expectedOutput) {
        assertArrayEquals(expectedOutput, ImageSmoother.imageSmoother(input));
    }

    public static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1},
                }, new int[][]{
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}
                }),
                Arguments.of(new int[][]{
                        {100, 200, 100},
                        {200, 50, 200},
                        {100, 200, 100},
                }, new int[][]{
                        {137, 141, 137},
                        {141, 138, 141},
                        {137, 141, 137}
                })
        );
    }
}
