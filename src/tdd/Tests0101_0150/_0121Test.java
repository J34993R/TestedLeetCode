package src.tdd.Tests0101_0150;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0101_0150._0118;
import src.Classes0101_0150._0121;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class _0121Test {

    private static _0121 solution;

    private static int[] prices;

    @BeforeClass
    public void setup() { solution = new _0121(); }

    @Test
    public void test1() {

        prices = new int[] {7,1,5,3,6,4};
        assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    public void test2() {

        prices = new int[] {7,6,4,3,1};
        assertEquals(0, solution.maxProfit(prices));
    }
    @Test
    public void test3() {

        prices = new int[] {2,4,1};
        assertEquals(2, solution.maxProfit(prices));
    }
    @Test
    public void test4() {

        prices = new int[] {3,2,6,5,0,3};
        assertEquals(4, solution.maxProfit(prices));
    }
    @Test
    public void test5() {

        prices = new int[] {1,2};
        assertEquals(1, solution.maxProfit(prices));
    }
}


