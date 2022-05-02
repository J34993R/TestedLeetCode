package src.tdd.Tests0051_0100;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0051_0100._0070;

import static org.testng.AssertJUnit.assertEquals;

public class _0070Test {

    private static _0070 solution;

    private static int n;

    @BeforeClass
    public void setup(){ solution = new _0070(); }

    @Test
    public void test1(){
        n = 2;
        assertEquals(2, solution.climbStairs(n));
    }

    @Test
    public void test2(){
        n = 3;
        assertEquals(3, solution.climbStairs(n));
    }
    @Test
    public void test3(){
        n = 6;
        assertEquals(13, solution.climbStairs(n));
    }
}
