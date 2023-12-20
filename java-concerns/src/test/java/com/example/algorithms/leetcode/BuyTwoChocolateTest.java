package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuyTwoChocolateTest {

    public static Stream<Arguments> pricesMoneyExpectedLeftover() {

        return Stream.of(
                Arguments.of(new int[]{1, 2, 2}, 3, 0),
                Arguments.of(new int[]{3, 2, 3}, 3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("pricesMoneyExpectedLeftover")
    void buyChocoTest(int[] prices, int money, int expectedLeftover) {
        assertEquals(expectedLeftover, BuyTwoChocolates.buyChocoBySorted(prices, money));
        assertEquals(expectedLeftover, BuyTwoChocolates.buyChoco(prices, money));
    }
}
