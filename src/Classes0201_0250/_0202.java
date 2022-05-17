package src.Classes0201_0250;

/* Date: 17/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/happy-number/
 *
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * Success
 * Runtime: 9 ms, faster than 5.85% of Java online submissions for Happy Number.
 * Memory Usage: 41.2 MB, less than 55.72% of Java online submissions for Happy Number.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _0202 {

    public boolean isHappy(int n) {

        String num = Integer.toString(n);
        Stack<Integer> results = new Stack<>();
        int sum = 0;
        LinkedList<Integer> contains = new LinkedList<>();


            do {
                if(contains.contains(sum)){
                    return false;
                }

                for(int i = 0; i < num.length(); i++) {
                    results.push(Character.getNumericValue(num.charAt(i)));
                    sum += Math.pow(results.pop(), 2);
                }

                n = sum;
                if(contains.contains(n)){
                    return false;
                }
                num = Integer.toString(n);
                sum = 0;
                contains.push(n);
            }while(n != 1);


        return true;
    }
}
