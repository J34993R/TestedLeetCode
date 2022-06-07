package src.tdd.Tests0051_0100;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0051_0100._0070;
import src.Classes0051_0100._0084;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class _0084Test {

    private static _0084 solution;

    private static int[] nums1, nums2, expected;
    private static int n, m;

    @BeforeClass
    public void setup(){ solution = new _0084(); }

    @Test
    public void test1(){
        m = 3;
        n = 3;
        expected = new int[] {1,2,2,3,5,6};
        nums1 = new int[] {1,2,3,0,0,0};
        nums2 = new int[] {2,5,6};
        assertArrayEquals(expected, solution.merge(nums1, m, nums2, n));
    }
    @Test
    public void test2(){
        m = 1;
        n = 0;
        expected = new int[] {1};
        nums1 = new int[] {1};
        nums2 = new int[] {};
        assertArrayEquals(expected, solution.merge(nums1, m, nums2, n));
    }
    @Test
    public void test3(){
        m = 0;
        n = 1;
        expected = new int[] {1};
        nums1 = new int[] {0};
        nums2 = new int[] {1};
        assertArrayEquals(expected, solution.merge(nums1, m, nums2, n));
    }

}
