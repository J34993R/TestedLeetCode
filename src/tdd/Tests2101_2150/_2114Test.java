package src.tdd.Tests2101_2150;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0201_0250._0242;
import src.Classes2101_2150._2114;

import static org.testng.AssertJUnit.assertEquals;

public class _2114Test {

    private static _2114 solution;

    private static String[] sentence;

    @BeforeClass
    public void setup(){ solution = new _2114(); }

    @Test
    public void test1 (){
        sentence = new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        assertEquals(6, solution.mostWordsFound(sentence));
    }

    @Test
    public void test2 (){
        sentence = new String[] {"please wait", "continue to fight", "continue to win"};
        assertEquals(3, solution.mostWordsFound(sentence));
    }



}
