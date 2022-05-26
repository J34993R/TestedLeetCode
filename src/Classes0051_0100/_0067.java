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
 */
public class _0067 {

    public String addBinary(String a, String b) {
        Long longA = Long.parseLong(a, 2);
        Long longB = Long.parseLong(b, 2);
        Long sum = longA + longB;

        return Long.toBinaryString(sum);
    }
}

