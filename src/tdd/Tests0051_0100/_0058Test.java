package src.tdd.Tests0051_0100;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0051_0100._0058;
import src.Classes0051_0100._0070;

import static org.testng.AssertJUnit.assertEquals;

public class _0058Test {

    private static _0058 solution;

    private static String s;

    @BeforeClass
    public void setup(){ solution = new _0058(); }

    @Test
    public void test1(){
        s = "Hello World";
        assertEquals(5, solution.lengthOfLastWord(s));
    }

    @Test
    public void test2(){
        s = "   fly me   to   the moon  ";
        assertEquals(4, solution.lengthOfLastWord(s));
    }
    @Test
    public void test3(){
        s = "luffy is still joyboy";
        assertEquals(6, solution.lengthOfLastWord(s));
    }

    @Test
    public void test4(){
        s = "a";
        assertEquals(1, solution.lengthOfLastWord(s));
    }
}
