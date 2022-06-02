package src.Classes0051_0100;

/* Date: 02/06/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/maximum-subarray/
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 *
 * Success
 * Runtime: 2 ms, faster than 58.14% of Java online submissions for Maximum Subarray.
 * Memory Usage: 73.4 MB, less than 58.70% of Java online submissions for Maximum Subarray.
 *
 */

import java.util.LinkedList;

public class _0053 {
    public int maxSubArray(int[] nums) {
        int ans = -999999999;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > ans){
                ans = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}
