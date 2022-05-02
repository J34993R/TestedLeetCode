package src.Classes0051_0100;

/* Date: 28/04/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/climbing-stairs/
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Success
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 * Memory Usage: 39 MB, less than 89.08% of Java online submissions for Climbing Stairs.
 *
 */

import java.util.HashMap;
import java.util.Map;

public class _0070 {

    private Map<Integer, Integer> memoizeTable = new HashMap<>();

    public int climbStairs(int n) {
        int ans = 0;

        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }

        if(this.memoizeTable.containsKey(n)) {
            return this.memoizeTable.get(n);
        }
        ans = climbStairs(n - 1) + climbStairs(n - 2);
        this.memoizeTable.put(n, ans);

        return ans;
    }
}
