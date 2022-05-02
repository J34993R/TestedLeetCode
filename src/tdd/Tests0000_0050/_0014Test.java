package src.tdd.Tests0000_0050;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0014;

import static org.testng.AssertJUnit.assertEquals;

public class _0014Test {

    private _0014 solution;

    private String[] str;

    @BeforeClass
    public void setup(){ solution = new _0014(); }

    @Test
    public void test1(){
        str = new String[] {"flower","flow","flight"};
        assertEquals("fl", solution.longestCommonPrefix(str));
    }

    @Test
    public void test2(){
        str = new String[] {"dog","racecar","car"};
        assertEquals("", solution.longestCommonPrefix(str));
    }
    @Test
    public void test3(){
        str = new String[] {};
        assertEquals("", solution.longestCommonPrefix(str));
    }
    @Test
    public void test4(){
        str = new String[] {"",""};
        assertEquals("", solution.longestCommonPrefix(str));
    }
    @Test
    public void test5(){
        str = new String[] {""};
        assertEquals("", solution.longestCommonPrefix(str));
    }
    @Test
    public void test6(){
        str = new String[] {"ab", "a"};
        assertEquals("a", solution.longestCommonPrefix(str));
    }
    @Test
    public void test7(){
        str = new String[] {"flower","flower","flower","flower"};
        assertEquals("flower", solution.longestCommonPrefix(str));
    }
}
