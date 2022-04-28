package src.Array;

public class _0035 {
    /*
    ACCEPTED
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
    Memory Usage: 43.8 MB, less than 22.39% of Java online submissions for Search Insert Position.
     */


    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        int length = nums.length;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]==target){
                ans = i;
                return ans;
            }else if (nums[0]>target){
                return ans;
            }else if(nums[length-1] < target){
                ans = nums.length;
                return ans;
            }else if (nums[i] < target && nums[i+1] > target){
                ans = i+1;
                return ans;
            }
        }

        return ans;
    }
}
