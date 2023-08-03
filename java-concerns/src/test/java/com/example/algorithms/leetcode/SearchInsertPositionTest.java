package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.SearchInsertPosition.searchInsert;
import static com.example.algorithms.leetcode.SearchInsertPosition.searchInsertBinarySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @ParameterizedTest
    @MethodSource("arrayTargetExpectedIndex")
    void testSearchInsert(int[] nums, int target, int expectedIndex) {
        int actual = searchInsert(nums, target);
        assertEquals(expectedIndex, actual);
    }

    @ParameterizedTest
    @MethodSource("arrayTargetExpectedIndex")
    void testSearchInsertBinarySearch(int[] nums, int target, int expectedIndex) {
        int actual = searchInsertBinarySearch(nums, target);
        assertEquals(expectedIndex, actual);
    }

    private static Stream<Arguments> arrayTargetExpectedIndex() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 0, 0),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4)
                );
    }
}
