package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Math._0009;
import src.String._0014;

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
