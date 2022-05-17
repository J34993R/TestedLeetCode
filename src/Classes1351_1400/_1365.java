package src.Classes1351_1400;

/* Date: 11/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * Return the answer in an array.
 *
 * Success
 * Runtime: 16 ms, faster than 51.89% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
 * Memory Usage: 45.1 MB, less than 12.43% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
 *
 */

public class _1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count ++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
