package src.String;

/*
Success - 2 attempts
Runtime: 3 ms, faster than 48.31% of Java online submissions for Truncate Sentence.
Memory Usage: 42.9 MB, less than 25.96% of Java online submissions for Truncate Sentence.
 */

public class _1816 {

    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String ans = "";

        for(int i = 0; i < k; i++){
            if ( i + 1 < k) {
                words[i] += " ";
            }
            ans += words[i];
        }

        return ans;
    }
}
