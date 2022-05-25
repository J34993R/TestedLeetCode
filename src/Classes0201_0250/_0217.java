package src.Classes0201_0250;

/* Date: 25/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source:https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Success
 * Runtime: 21 ms, faster than 25.90% of Java online submissions for Contains Duplicate.
 * Memory Usage: 71.2 MB, less than 22.83% of Java online submissions for Contains Duplicate.
 *
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class _0217 {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) return true;
        }

        return false;
    }
}

