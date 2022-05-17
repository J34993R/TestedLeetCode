package src.Classes0051_0100;

/* Date: 05/04/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/length-of-last-word/
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Success
 * Runtime: 6 ms, faster than 6.10% of Java online submissions for Length of Last Word.
 * Memory Usage: 41 MB, less than 73.22% of Java online submissions for Length of Last Word.
 */

public class _0058 {
    public int lengthOfLastWord(String s) {
        String ans = "";
        boolean hasWord = false;

        if(s.length() == 0) {
            return 0;
        }

        for(int i = s.length() - 1; i >= 0; i--) {
            if(!hasWord){
                if(s.charAt(i) != ' '){
                    hasWord = true;
                    ans += s.charAt(i);
                }
            }else {
                if(s.charAt(i) == ' '){
                    return ans.length();
                }else {
                    ans += s.charAt(i);
                }
            }
        }

        return ans.length();
    }
}
