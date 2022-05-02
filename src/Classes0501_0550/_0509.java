package src.Classes0501_0550;
/* Date: 28/04/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/fibonacci-number/
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 * Success - 1 attempt
 * Runtime: 10 ms, faster than 26.60% of Java online submissions for Fibonacci Number.
 * Memory Usage: 39.1 MB, less than 84.70% of Java online submissions for Fibonacci Number.
 *
 */

public class _0509 {

    public int fib(int n) {
        int ans;
        if(n == 0) return 0;
        if(n == 1) return 1;

        ans = sumFibb(n);
        return ans;
    }

    public int sumFibb(int n) {
        int sum;
        if(n == 0) return 0;
        if(n == 1) return 1;
        sum = sumFibb(n - 1) + sumFibb(n - 2);

        return sum;
    }

}
