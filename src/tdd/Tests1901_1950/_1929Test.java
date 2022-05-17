package src.tdd.Tests1901_1950;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes1351_1400._1365;
import src.Classes1901_1950._1929;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class _1929Test {

    private static _1929 solution;

    private static int[] nums;

    private static int[] expected;

    @BeforeClass
    public void setup(){ solution = new _1929(); }

    @Test
    public void test1(){
        nums = new int[] {1,2,1};
        expected = new int[] {1,2,1,1,2,1};
        assertEquals(expected, solution.getConcatenation(nums));
    }
    @Test
    public void test2(){
        nums = new int[] {1,3,2,1};
        expected = new int[] {1,3,2,1,1,3,2,1};
        assertEquals(expected, solution.getConcatenation(nums));
    }
}
