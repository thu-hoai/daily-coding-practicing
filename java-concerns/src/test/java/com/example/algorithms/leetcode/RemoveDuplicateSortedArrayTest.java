package com.example.algorithms.leetcode;

import com.example.algorithms.leetcode.RemoveDuplicateSortedArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateSortedArrayTest {

    @ParameterizedTest
    @MethodSource("test")
    void testFindDuplicateSortedArray(int[] input, int expectedInt) {
        int actual = RemoveDuplicateSortedArray.removeDuplicates(input);
        assertEquals(expectedInt, actual);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5)
        );
    }
}
