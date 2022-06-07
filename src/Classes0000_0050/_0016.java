package src.Classes0000_0050;

import java.util.Arrays;

public class _0016 {

    /* Date: 07/06/2022
     * User: Guilherme Alves de Oliveira
     *
     * Source: https://leetcode.com/problems/3sum-closest/
     *
     * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
     * Return the sum of the three integers.
     * You may assume that each input would have exactly one solution.
     *
     * Success
     * Runtime: 16 ms, faster than 22.86% of Java online submissions for 3Sum Closest.
     * Memory Usage: 42.7 MB, less than 64.42% of Java online submissions for 3Sum Closest.
     *
     */

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int comparator = Integer.MAX_VALUE;

        numLoop:
        for(int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > target) {
                    right--;
                } else if(sum < target) {
                    left++;
                } else {
                    ans = sum;
                    break numLoop;
                }

                int a = Math.abs(target - sum);

                if(a < comparator) {
                    comparator = a;
                    ans = sum;
                }
            }
        }

        return ans;
    }

}
