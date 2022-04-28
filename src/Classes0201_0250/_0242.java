package src.String;

import java.util.Stack;

public class _0242 {
    /*
    ACCEPTED -
    Submmit at 03/28/2022 - two attempts
    Runtime: 923 ms, faster than 5.03% of Java online submissions for Valid Anagram.
    Memory Usage: 373.6 MB, less than 5.22% of Java online submissions for Valid Anagram.
     */

    public boolean isAnagram(String s, String t) {
        long qtdCharS = 0, qtdCharT = 0;
        Character c;
        String onlyChars = "";
        String newS = s;

        if (s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            onlyChars = onlyChars + c;
            s = s.replace(s.charAt(i), ' ');

        }

        onlyChars = onlyChars.replaceAll(" ", "");

        for (int i = 0; i < onlyChars.length(); i++){
            Character k = onlyChars.charAt(i);
            if(newS.chars().filter(ch -> ch == k).count() == t.chars().filter(ch -> ch == k).count()){
                qtdCharS = newS.chars().filter(ch -> ch == k).count() + qtdCharS;
                qtdCharT = t.chars().filter(ch -> ch == k).count() + qtdCharT;
            }else
                return false;

        }

        return qtdCharS == qtdCharT;

    }
}
