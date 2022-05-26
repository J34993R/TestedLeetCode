package src.tdd.Tests1451_1500;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0051_0100._0067;
import src.Classes1451_1500._1480;

import static org.testng.AssertJUnit.assertEquals;

public class _1480Test {

    private static _1480 solution;

    private static int[] nums, expected;

    @BeforeClass
    public static void setup(){
        solution = new _1480();
    }

    @Test
    public void test1(){
        nums = new int[] {1,2,3,4};
        expected = new int[] {1,3,6,10};
        assertEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void test2(){
        nums = new int[] {1,1,1,1,1};
        expected = new int[] {1,2,3,4,5};
        assertEquals(expected, solution.runningSum(nums));
    }
    @Test
    public void test3(){
        nums = new int[] {3,1,2,10,1};
        expected = new int[] {3,4,6,16,17};
        assertEquals(expected, solution.runningSum(nums));
    }
}

