package src.Classes0101_0150;

import java.util.*;

/* Date: 02/06/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Success
 * Runtime: 3 ms, faster than 53.86% of Java online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 84 MB, less than 28.69% of Java online submissions for Best Time to Buy and Sell Stock.
 *
 */

public class _0121 {

    public int maxProfit(int[] prices) {
        int lowerValue = Integer.MAX_VALUE;
        int hint = 0;
        int oportunity = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < lowerValue){
                lowerValue = prices[i];
            }
            hint = prices[i] - lowerValue;
            if(oportunity < hint){
                oportunity = hint;
            }
        }
        return oportunity;
    }
}

