package src.Classes1451_1500;

/* Date:26/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source:https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 *
 * Success
 * Runtime: 5 ms, faster than 6.19% of Java online submissions for Running Sum of 1d Array.
 * Memory Usage: 43.2 MB, less than 50.77% of Java online submissions for Running Sum of 1d Array.
 *
 */

public class _1480 {

    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        for( int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            for(int j = i; j > 0; j--){
                ans[i] = nums[j-1] + ans[i];
            }
        }

        return ans;
    }
}
