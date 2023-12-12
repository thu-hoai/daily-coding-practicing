package com.example.algorithms.leetcode;

public class BestPrice {

    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - minPrice) > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int maxProfitBruteForce(int[] prices) {
        int profit = 0;
        for (int j = 1; j < prices.length; j++) {
            for (int i = 0; i < prices.length - 1; i++) {
                if (i > j) break;
                int temp = prices[j] - prices[i];
                if (temp > profit) {
                    profit = temp;
                }
            }
        }
        return profit;
    }

}

