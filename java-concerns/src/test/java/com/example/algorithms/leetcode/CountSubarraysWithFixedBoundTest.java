package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.CountSubarraysWithFixedBound.countSubarrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubarraysWithFixedBoundTest {

    public static Stream<Arguments> arrMinKMaxKExpected() {

        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 2, 7, 5}, 1, 5, 2),
                Arguments.of(new int[]{0, 1, 3, 5, 2, 7, 5, 3, 1, 2, 2 ,5}, 1, 5, 8),
                Arguments.of(new int[]{1, 1, 1, 1}, 1, 1, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("arrMinKMaxKExpected")
    void countSubarraysTest(int[] arr, int minK, int maxK, int expected) {
        assertEquals(expected, countSubarrays(arr, minK, maxK));
    }
}
