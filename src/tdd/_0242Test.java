package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.String._0242;

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
