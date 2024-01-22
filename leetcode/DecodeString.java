package leetcode;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);

            if (ch == ']') {
                decode(stack);
            } else {
                stack.push(String.valueOf(ch));
            }
        }

        StringBuilder newStr = new StringBuilder();
        while (!stack.isEmpty()) {
            newStr.insert(0, stack.pop());
        }

        return newStr.toString();
    }

    private void decode(Stack<String> stack) {
        StringBuilder decoded = new StringBuilder();
        String popped;

        while (!(popped = stack.pop()).equals("[")) {
            decoded.insert(0, popped);
        }

        StringBuilder countStr = new StringBuilder();
        while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
            countStr.insert(0, stack.pop());
        }

        int count = !countStr.isEmpty() ? Integer.parseInt(countStr.toString()) : 0;

        String repeatedStr = decoded.toString().repeat(count);
        stack.push(repeatedStr);
    }
}
