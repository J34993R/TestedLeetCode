package src.Array;

public class _0001 {
    /*
    ACCEPTED
    Runtime: 70 ms, faster than 27.59% of Java online submissions for Two Sum.
    Memory Usage: 45.2 MB, less than 47.56% of Java online submissions for Two Sum.
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
                    return lista;
                }
            }
        }
        return lista;
    }

}
