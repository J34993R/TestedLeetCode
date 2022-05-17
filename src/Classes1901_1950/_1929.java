package src.Classes1901_1950;

/* Date: 12/05/2020
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/concatenation-of-array/submissions/
 *
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 *
 * Success
 * Runtime: 1 ms, faster than 91.98% of Java online submissions for Concatenation of Array.
 * Memory Usage: 50.1 MB, less than 38.70% of Java online submissions for Concatenation of Array.
 *
 */

public class _1929 {

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];
        int counter = 0;

        for(int i = 0; i < ans.length; i++){
            if(i >= nums.length){
                ans[i] = nums[counter];
                counter++;
            }else
                ans[i] = nums[i];
        }

        return ans;
    }

}
