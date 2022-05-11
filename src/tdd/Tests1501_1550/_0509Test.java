package src.tdd.Tests0501_0550;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0501_0550._0509;

import static org.testng.AssertJUnit.assertEquals;

public class _1528 {

    private static _1528 solution;

    private static String s;
    
    private static int[] indices;

    @BeforeClass
    public void setup(){ solution = new _1528(); }

    @Test
    public void test1(){
        s = "codeleet";
        indices = new int[] {4,5,6,7,0,2,1,3};
        
        assertEquals("leetcode" ,solution.restoreString(s, indices));
    }
    
    @Test
    public void test2(){
        s = "abc";
        indices = new int[] {0,1,2};
        
        assertEquals("leetcode" ,solution.restoreString(s, indices));
    }

}
