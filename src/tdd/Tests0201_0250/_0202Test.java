package src.tdd.Tests0201_0250;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0201_0250._0202;
import src.Classes0201_0250._0242;

import static org.testng.AssertJUnit.assertEquals;

public class _0202Test {

    private static _0202 solution;

    private static int n;

    @BeforeClass
    public void setup(){ solution = new _0202(); }

    @Test
    public void test1 (){
        n = 19;
        assertEquals(true, solution.isHappy(n));
    }
    @Test
    public void test2 (){
        n = 2;
        assertEquals(false, solution.isHappy(n));
    }



}
