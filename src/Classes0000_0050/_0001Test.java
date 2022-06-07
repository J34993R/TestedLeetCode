package src.Classes0000_0050;

import java.util.Arrays;

public class _0001Test {
    /* Date:
     * User: Guilherme Alves de Oliveira
     *
     * Source: https://leetcode.com/problems/two-sum/
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     *
     * Success
     * Runtime: 70 ms, faster than 27.59% of Java online submissions for Two Sum.
     * Memory Usage: 45.2 MB, less than 47.56% of Java online submissions for Two Sum.
     */

    public int[] twoSum(int[] nums, int target) {
        int[] lista = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length ; j++){
                if (i==j){
                    break;
                }
                if (nums[i] + nums[j] == target){
                    lista[0] = i;
                    lista[1] = j;
                    Arrays.sort(lista);
                    return lista;
                }
            }
        }
        return lista;
    }

}
