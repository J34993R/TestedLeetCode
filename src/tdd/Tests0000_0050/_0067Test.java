package src.tdd.Tests0000_0050;

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
    @Test
    public void test3(){
        a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        assertEquals("10111010101001110111100111010111010010110000001110110000000000000", solution.addBinary(a, b));
    }

}

