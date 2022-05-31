package src.Classes0000_0050;

public class _0013 {

    /* Date: 31/05/2022
     * User: Guilherme Alves de Oliveira
     *
     * Source: https://leetcode.com/problems/roman-to-integer/
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     *
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     *
     * Success
     * Runtime: 10 ms, faster than 42.18% of Java online submissions for Roman to Integer.
     * Memory Usage: 45.8 MB, less than 47.12% of Java online submissions for Roman to Integer.
     *
     */
    public int romanToInt(String s) {
        int ans = 0;
        int len = s.length();

        if(s.length() == 0 || s == null) {
            return ans;
        }

        for(int i = 0; i < len; i++) {
            switch(s.charAt(i)) {
                case 'I':
                    if(i + 1 < len) {
                        if("VX".contains(s.charAt(i + 1) + "")) {
                            ans--;
                            break;
                        }
                    }
                    ans++;
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    if(i + 1 < len) {
                        if("LC".contains(s.charAt(i + 1) + "")) {
                            ans -= 10;
                            break;
                        }
                    }
                    ans += 10;
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    if(i + 1 < len) {
                        if("DM".contains(s.charAt(i + 1) + "")) {
                            ans -= 100;
                            break;
                        }
                    }
                    ans += 100;
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
            }
        }

        return ans;
    }


}
