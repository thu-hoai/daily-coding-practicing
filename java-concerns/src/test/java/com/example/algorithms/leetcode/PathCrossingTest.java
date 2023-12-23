package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathCrossingTest {

    public static Stream<Arguments> pathExpected() {
        return Stream.of(
                Arguments.of("SS", false),
                Arguments.of("NES", false),
                Arguments.of("NESWW", true)
        );
    }

    @ParameterizedTest
    @MethodSource("pathExpected")
    void isPathCrossingTest(String path, boolean expected) {
        assertEquals(expected, PathCrossing.isPathCrossingSet(path));
        assertEquals(expected, PathCrossing.isPathCrossingO2List(path));
    }
}
