package src.tdd.Tests0000_0050;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0009;

import static org.testng.AssertJUnit.assertEquals;

public class _0009Test {

    private _0009 solution;

    private int x;

    @BeforeClass
    public void setup() {solution = new _0009();}

    @Test
    public void test1() {
        x = 121;
        assertEquals(true, solution.isPalindrome(x));
    }

    @Test
    public void test2() {
        x = -121;
        assertEquals(false, solution.isPalindrome(x));
    }

    @Test
    public void test3() {
        x = 10;
        assertEquals(false, solution.isPalindrome(x));
    }
}
