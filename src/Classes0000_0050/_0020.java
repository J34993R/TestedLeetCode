package src.Classes0000_0050;

import java.util.Stack;

public class _0020 {
    public boolean isValid(String s) {
        /*
        ACCEPTED
        Runtime: 4 ms, faster than 24.44% of Java online submissions for Valid Parentheses.
        Memory Usage: 43.4 MB, less than 5.55% of Java online submissions for Valid Parentheses.
         */
        Stack<String> stackOpen = new Stack<>();
        String comparator = "";

        if (s.length() % 2 != 0){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (c.toString().equals("(") || c.toString().equals("[") || c.toString().equals("{")) {
                stackOpen.push(c.toString());
            } else {
                if (stackOpen.size() > 0) {
                    comparator = stackOpen.pop();
                    if (comparator.equals("(")) {
                        if (c.toString().equals(")")) {

                        } else
                            return false;
                    } else if (comparator.equals("[")) {
                        if (c.toString().equals("]")) {

                        } else
                            return false;
                    } else if (comparator.equals("{")) {
                        if (c.toString().equals("}")) {

                        } else
                            return false;
                    }
                }else
                    return false;
            }
        }
        return !comparator.equals("") && stackOpen.size() == 0;
    }
}
