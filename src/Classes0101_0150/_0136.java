package src.Classes0101_0150;

public class _0136 {

/* Date: 24/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/single-number/
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Success
 * Runtime: 1 ms, faster than 98.07% of Java online submissions for Single Number.
 * Memory Usage: 49.9 MB, less than 69.24% of Java online submissions for Single Number.
 *
 */

    public int singleNumber(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num^=nums[i];
        }
        return num;
    }
}
