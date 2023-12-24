package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinChangesBinaryStringTest {
    public static Stream<Arguments> binaryStringExpected() {
        return Stream.of(
                Arguments.of("10010100", 3),
                Arguments.of("0100", 1),
                Arguments.of("10", 0),
                Arguments.of("1111", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("binaryStringExpected")
    void minOperationsTest(String binaryString, int expected) {
        assertEquals(expected, MinChangesBinaryString.minOperations(binaryString));
        assertEquals(expected, MinChangesBinaryString.minOperationsFlip(binaryString));
    }
}
