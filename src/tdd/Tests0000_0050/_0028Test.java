package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.String._0020;
import src.String._0028;

import static org.testng.AssertJUnit.assertEquals;

public class _0028Test {

    private static _0028 solution;

    private static String haystack, needle;

    @BeforeClass
    public static void setup(){
        solution = new _0028();
    }

    @Test
    public void test1(){
        haystack = "hello";
        needle = "ll";
        assertEquals(2, solution.strStr(haystack, needle));
    }

    @Test
    public void test2(){
        haystack = "aaaaa";
        needle = "bba";
        assertEquals(-1, solution.strStr(haystack, needle));
    }
}
