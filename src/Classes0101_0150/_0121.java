package src.Classes0101_0150;

import java.util.*;

public class _0121 {

    public int maxProfit(int[] prices) {

        int higher = 0;
        int lower = 0;
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();

        if(prices.length == 1) {
            return 0;
        }
        for(int i = 0; i < prices.length; i++) {
            for(int j = i; j < prices.length; j++) {
                if(prices[i] > prices[j]) {

                } else {
                    list.add(prices[j] - prices[i]);
                }
            }

        }

        sum = Collections.max(list);
        if(sum <= 0) {
            return 0;
        }
        return sum;
    }
}

/*
7,1,5,3,6,4
lower = 1
higher = 7
*/