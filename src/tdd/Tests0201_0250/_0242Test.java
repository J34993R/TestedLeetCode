package src.tdd.Tests0201_0250;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0201_0250._0242;

import static org.testng.AssertJUnit.assertEquals;

public class _0242Test {

    private static  _0242 solution;

    private static String s, t;

    @BeforeClass
    public void setup(){ solution = new _0242(); }

    @Test
    public void test1 (){
        s = "anagram";
        t = "nagaram";
        assertEquals(true, solution.isAnagram(s, t));
    }

    @Test
    public void test2 (){
        s = "rat";
        t = "car";
        assertEquals(false, solution.isAnagram(s, t));
    }

}
