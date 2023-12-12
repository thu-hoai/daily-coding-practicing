package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.BestPrice.maxProfitBruteForce;
import static com.example.algorithms.leetcode.BestPrice.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BestPriceTest {

    @ParameterizedTest
    @MethodSource("inputExpectedProfit")
    void testMaxProfit(int[] prices, int expectedProfit) {
        assertEquals(expectedProfit, maxProfitBruteForce(prices));
        assertEquals(expectedProfit, maxProfit(prices));
    }

    private static Stream<Arguments> inputExpectedProfit() {
        return Stream.of(
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{5, 5, 5, 5, 5}, 0),
                Arguments.of(new int[]{3, 2}, 0),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, 0),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{2, 1, 2, 1, 0, 1, 2}, 2),
                Arguments.of(new int[]{2, 4, 1}, 2),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5)
        );
    }
}