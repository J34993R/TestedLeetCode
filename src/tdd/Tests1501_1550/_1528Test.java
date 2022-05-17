package src.tdd.Tests1501_1550;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes1501_1550._1528;

import static org.testng.AssertJUnit.assertEquals;

public class _1528Test {

    private static _1528 solution;
    private static String s;
    private static int[] indices;

    @BeforeClass
    public void setup(){ solution = new _1528(); }

    @Test
    public void test1(){
        s = "codeleet";
        indices = new int[] {4,5,6,7,0,2,1,3};
        assertEquals("leetcode", solution.restoreString(s, indices));
    }
    @Test
    public void test2(){
        s = "abc";
        indices = new int[] {0,1,2};
        assertEquals("abc", solution.restoreString(s, indices));
    }
    @Test
    public void test3(){
        s = "abc";
        indices = new int[] {2,1,0};
        assertEquals("cba", solution.restoreString(s, indices));
    }
    @Test
    public void test4(){
        s = "codeleet";
        indices = new int[] {4,5,6,7,0,1,2,3};
        assertEquals("leetcode", solution.restoreString(s, indices));
    }
}
