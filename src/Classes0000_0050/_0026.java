package src.Classes0000_0050;

/* Date: 03/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Success
 * Runtime: 1 ms, faster than 88.59% of Java online submissions for Remove Duplicates from Sorted Array.
 * Memory Usage: 48.3 MB, less than 15.57% of Java online submissions for Remove Duplicates from Sorted Array.
 */

public class _0026 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int comparator = 0;

            for(int i = 0; i < nums.length; i++) {
                if(i == 0) {
                    comparator = nums[i];
                } else if(nums[i] == comparator) {

                } else {
                    comparator = nums[i];
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
    }
}
