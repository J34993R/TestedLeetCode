package src.Classes2101_2150;

/* Date: 19/05/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 *
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * Return the maximum number of words that appear in a single sentence.
 *
 * Success
 * Runtime: 5 ms, faster than 58.72% of Java online submissions for Maximum Number of Words Found in Sentences.
 * Memory Usage: 43.1 MB, less than 61.79% of Java online submissions for Maximum Number of Words Found in Sentences
 *
 */

import java.util.Arrays;
import java.util.Collections;

public class _2114 {

    public int mostWordsFound(String[] sentences) {

        int[] counter = new int[sentences.length];
        int ans = counter[0];

        for(int i = 0; i < sentences.length; i++){
            String phrase = sentences[i];
            for(int j = 0; j < phrase.length(); j++){
                if(counter[i] == 0){
                    counter[i] = 1;
                }
                if (phrase.charAt(j) == ' '){
                    counter[i] ++;
                }
            }
        }

        for(int i = 0; i < counter.length; i++){
            if(counter[i] > ans){
                ans = counter[i];
            }
        }

        return ans;
    }

}
