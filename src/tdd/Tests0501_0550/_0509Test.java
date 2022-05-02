package src.tdd.Tests0501_0550;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0501_0550._0509;

import static org.testng.AssertJUnit.assertEquals;

public class _0509Test {

    private static _0509 solution;

    private static int n;

    @BeforeClass
    public void setup(){ solution = new _0509(); }

    @Test
    public void test1(){
        n = 5;
        assertEquals(5 ,solution.fib(n));
    }
    @Test
    public void test4(){
        n = 2;
        assertEquals(1 ,solution.fib(n));
    }
    @Test
    public void test2(){
        n = 3;
        assertEquals(2 ,solution.fib(n));
    }

    @Test
    public void test3(){
        n = 4;
        assertEquals(3 ,solution.fib(n));
    }

}
