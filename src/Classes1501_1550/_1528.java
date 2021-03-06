package src.Classes1501_1550;
/* Date: 10/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/shuffle-string/
 * You are given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 *
 * Success
 * Runtime: 10 ms, faster than 13.19% of Java online submissions for Shuffle String.
 * Memory Usage: 47 MB, less than 5.53% of Java online submissions for Shuffle String.
 *
 */
public class _1528 {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        Character[] order = new Character[s.length()];

        for(int i = 0; i < indices.length; i++) {
            order[indices[i]] = s.charAt(i);
        }

        for(int i = 0; i < order.length; i++) {
            ans += order[i];
        }

        return ans;
    }

}
/*
        String ans = "";

        for(int i = 0; i < indices.length; i++){
            ans += s.charAt(indices[i]);
        }

        return ans;
    }
 */
