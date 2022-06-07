package src.Classes0051_0100;

/* Date: 07/06/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/plus-one/
 *
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Success
 * Runtime: 1 ms, faster than 25.73% of Java online submissions for Plus One.
 * Memory Usage: 42.7 MB, less than 31.59% of Java online submissions for Plus One.
 *
 */

import java.util.Stack;

public class _0066 {

    public int[] plusOne(int[] digits) {
        int sum = 0;
        int counter = 0;
        int j = digits.length;
        int[] plusOne = new int[digits.length + 1];
        plusOne[0] = 1;

        for(int i = digits.length - 1; i >= 0; i--) {
            if(i == digits.length - 1) {
                sum = digits[i] + counter + 1;
            } else {
                sum = digits[i] + counter;
            }

            if(sum < 10) {
                digits[i] = sum;
                return digits;
            } else {
                counter = 1;
                digits[i] = 0;
                plusOne[j] = 0;
                j--;
            }
        }

        if(digits[0] == 0) {
            return plusOne;
        }

        return digits;
    }
}

