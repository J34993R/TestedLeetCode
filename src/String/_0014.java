package src.String;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _0014 {
    /*
    Success - Attempts -> 6
    Runtime: 1 ms, faster than 81.10% of Java online submissions for Longest Common Prefix.
    Memory Usage: 40.1 MB, less than 90.90% of Java online submissions for Longest Common Prefix.     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String str = strs[0];
        for(int i = 1; i < strs.length; i++){
            int count = 0;
            for(int j = 0; j < strs[i].length() && j < str.length(); j++){
                if(str.charAt(j) == strs[i].charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            str = strs[i].substring(0,count);
        }
        return str;
    }


}
