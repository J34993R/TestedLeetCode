package src.Math;

public class _0009 {

    public boolean isPalindrome(Integer x) {
        /*
        Runtime: 17 ms, faster than 28.94% of Java online submissions for Pascal's Triangle.
        Memory Usage: 45.4 MB, less than 23.65% of Java online submissions for Pascal's Triangle.
         */

        String s = x.toString();


        for (int i = 0; i <= (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}