package com.example.algorithms.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/buy-two-chocolates/description
 */
public class BuyTwoChocolates {

    public static int buyChocoBySorted(int[] prices, int money) {
        int[] sortedPrices = Arrays.stream(prices).sorted().toArray();
        int leftover = money;

        if (money >= (sortedPrices[0] + sortedPrices[1])) {
            leftover = money - sortedPrices[0] - sortedPrices[1];
        }

        return leftover;
    }

    public static int buyChoco(int[] prices, int money) {
        int leftover = money;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                secondMin = min;
                min = price;
            } else if (price < secondMin) {
                secondMin = price;
            }
        }
        if (money >= min + secondMin) {
            leftover = money - min - secondMin;
        }

        return leftover;
    }
}
