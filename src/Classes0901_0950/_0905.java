package src.Classes0901_0950;

/* Date: 02/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/sort-array-by-parity/
 *
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 *
 * Success
 * Runtime: 6 ms, faster than 8.17% of Java online submissions for Sort Array By Parity.
 * Memory Usage: 49.3 MB, less than 6.02% of Java online submissions for Sort Array By Parity.
 */

import java.util.Stack;

public class _0905 {

    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> even = new Stack<>();
        Stack<Integer> odd = new Stack<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0) {
                even.push(nums[i]);
            }else {
                odd.push(nums[i]);
            }
        }

        for(int i = 0; i < ans.length; i++){
            if(even.empty()){
                ans[i] = odd.pop();
            }else {
                ans[i] = even.pop();
            }
        }

        return ans;
    }
}
