package src.Classes0101_0150;

public class _0136 {

    /*
    Didn't tried an attempt
     */


    public int singleNumber(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num^=nums[i];
        }
        return num;
    }
}
