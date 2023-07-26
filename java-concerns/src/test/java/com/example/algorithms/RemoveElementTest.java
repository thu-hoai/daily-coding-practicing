package com.example.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @ParameterizedTest
    @MethodSource("inputArrayValueExpectedOut")
    void testRemoveElement(int[] nums, int val, int expectedInt) {
        int actual = RemoveElement.removeElement(nums, val);
        assertEquals(expectedInt, actual);
    }

    private static Stream<Arguments> inputArrayValueExpectedOut() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 2, 0),
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 2, 0),
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5)
        );
    }
}