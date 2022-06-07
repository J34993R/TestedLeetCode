package src.Classes0051_0100;


import java.util.HashMap;
import java.util.Map;

/* Date:
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/add-binary/
 *
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Success
 * Runtime: 16 ms, faster than 6.27% of Java online submissions for Add Binary.
 * Memory Usage: 43.6 MB, less than 15.51% of Java online submissions for Add Binary.
 *
 */

public class _0067 {

    public String addBinary(String a, String b) {
        int counter = 0;
        String ans = "";

        if(a.length() > b.length()) {
            while(b.length() != a.length()) {
                b = "0" + b;
            }
        } else {
            while(a.length() != b.length()) {
                a = "0" + a;
            }
        }

        for(int i = a.length() - 1; i >= 0; i--) {
            int numA = Character.getNumericValue(a.charAt(i));
            int numB = Character.getNumericValue(b.charAt(i));

            int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + counter;

            switch(sum){
                default:
                    ans = sum + ans;
                    counter = 0;
                    break;
                case 2:
                    ans = "0" + ans;
                    counter = 1;
                    break;
                case 3:
                    ans = "1" + ans;
                    counter = 1;
                    break;
            }

        }

        if(counter == 1){
            ans = "1" + ans;
        }

        // ans = numero + ans;
        return ans;
    }
}

