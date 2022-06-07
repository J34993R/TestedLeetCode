package src.Classes0000_0050;


import java.util.Arrays;

/* Date: 07/06/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source:https://leetcode.com/problems/remove-element/
 *
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * Custom Judge:
 * The judge will test your solution with the following code:
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 * int k = removeElement(nums, val); // Calls your implementation
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 *
 * Success
 * Runtime: 1 ms, faster than 28.06% of Java online submissions for Remove Element.
 * Memory Usage: 42.7 MB, less than 39.09% of Java online submissions for Remove Element.
 *
 */

public class _0027 {
    public int removeElement(int[] nums, int val) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                ans++;
                nums[i] = Integer.MAX_VALUE;
            }
        }

        Arrays.sort(nums);

        return nums.length - ans;
    }
}
