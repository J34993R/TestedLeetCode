package src.tdd.Tests0000_0050;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0020;

import static org.testng.AssertJUnit.assertEquals;

public class _0020Test {

    private static _0020 solution;
    private static String A;

    @BeforeClass
    public static void setup(){
        solution = new _0020();
    }

    @Test
    public void test1(){
        A = "{}";
        assertEquals(true, solution.isValid(A));
    }

    @Test
    public void test2(){
        A = "{}()[]";
        assertEquals(true, solution.isValid(A));
    }

    @Test
    public void test3(){
        A = "{";
        assertEquals(false, solution.isValid(A));
    }

    @Test
    public void test4(){
        A = "}";
        assertEquals(false, solution.isValid(A));
    }
}
