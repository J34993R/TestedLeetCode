package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.String._1816;

import static org.testng.AssertJUnit.assertEquals;

public class _1816Test {

    private static _1816 solution;
    private String s;
    private int k;

    @BeforeClass
    public void setup(){ solution = new _1816(); }

    @Test
    public void test1(){
       s = "Hello how are you Contestant";
       k = 4;
       assertEquals("Hello how are you", solution.truncateSentence(s, k));
    }

    @Test
    public void test2(){
        s = "What is the solution to this problem";
        k = 4;
        assertEquals("What is the solution", solution.truncateSentence(s, k));
    }

    @Test
    public void test3(){
        s = "chopper is not a tanuki";
        k = 5;
        assertEquals("chopper is not a tanuki", solution.truncateSentence(s, k));
    }
}
