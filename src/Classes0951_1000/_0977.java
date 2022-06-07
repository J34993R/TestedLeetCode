package src.Classes0951_1000;


import java.util.Arrays;

/* Date: 07/06/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/squares-of-a-sorted-array/
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Success
 * Runtime: 6 ms, faster than 35.35% of Java online submissions for Squares of a Sorted Array.
 * Memory Usage: 55.7 MB, less than 36.52% of Java online submissions for Squares of a Sorted Array.
 *
 */


public class _0977 {

    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}
