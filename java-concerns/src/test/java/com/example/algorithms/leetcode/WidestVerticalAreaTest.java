package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WidestVerticalAreaTest {

    public static Stream<Arguments> inputExpectedOutput() {

        return Stream.of(
                Arguments.of(new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}}, 1),
                Arguments.of(new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void maxWidthOfVerticalAreaTest(int[][] input, int expected) {
        assertEquals(expected, WidestVerticalArea.maxWidthOfVerticalArea(input));
    }
}
