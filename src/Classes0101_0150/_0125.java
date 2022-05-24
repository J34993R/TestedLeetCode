package src.Classes0101_0150;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;

/* Date: 24/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source:https://leetcode.com/problems/valid-palindrome/
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Success
 * Runtime: 1170 ms, faster than 5.01% of Java online submissions for Valid Palindrome.
 * Memory Usage: 47.1 MB, less than 22.48% of Java online submissions for Valid Palindrome.
 *
 */
public class _0125 {


    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        int counter = s.length()-1;

        for(int i = 0; i < s.length() ; i++, counter--){
            if(s.charAt(i) != s.charAt(counter)){
                return false;
            }
        }

        return true;
    }
}

/*
7,1,5,3,6,4
lower = 1
higher = 7
*/