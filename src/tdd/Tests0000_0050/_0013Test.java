package src.tdd.Tests0000_0050;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0013;
import src.Classes0000_0050._0014;

import static org.testng.AssertJUnit.assertEquals;

public class _0013Test {

    private _0013 solution;

    private String s;

    @BeforeClass
    public void setup(){ solution = new _0013(); }

    @Test
    public void test1(){
        s = "III";
        assertEquals(3, solution.romanToInt(s));
    }
    @Test
    public void test2(){
        s = "LVIII";
        assertEquals(58, solution.romanToInt(s));
    }
    @Test
    public void test3(){
        s = "MCMXCIV";
        assertEquals(1994, solution.romanToInt(s));
    }


}
