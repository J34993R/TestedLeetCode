package src.tdd.Tests0051_0100;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0028;
import src.Classes0051_0100._0067;

import static org.testng.AssertJUnit.assertEquals;

public class _0067Test {

    private static _0067 solution;

    private static String a, b;

    @BeforeClass
    public static void setup(){
        solution = new _0067();
    }

    @Test
    public void test1(){
        a = "11";
        b = "1";
        assertEquals("100", solution.addBinary(a, b));
    }

    @Test
    public void test2(){
        a = "1010";
        b = "1011";
        assertEquals("10101", solution.addBinary(a, b));
    }


}

