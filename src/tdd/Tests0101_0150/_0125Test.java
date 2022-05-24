package src.tdd.Tests0101_0150;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0101_0150._0121;
import src.Classes0101_0150._0125;

import static org.testng.AssertJUnit.assertEquals;

public class _0125Test {

    private static _0125 solution;

    private static String s;

    @BeforeClass
    public void setup() { solution = new _0125(); }

    @Test
    public void test1() {

        s = "A man, a plan, a canal: Panama";
        assertEquals(true, solution.isPalindrome(s));
    }

    @Test
    public void test2() {

        s = "race a car";
        assertEquals(false, solution.isPalindrome(s));
    }

    @Test
    public void test3() {

        s = " ";
        assertEquals(true, solution.isPalindrome(s));
    }
    @Test
    public void test4() {

        s = "0P";
        assertEquals(false, solution.isPalindrome(s));
    }
}


