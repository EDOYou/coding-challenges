package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    st.push(c);
                    break;
                case ')':
                    if (st.isEmpty() || st.pop() != '(') return false;
                    break;
                case '}':
                    if (st.isEmpty() || st.pop() != '{') return false;
                    break;
                case ']':
                    if (st.isEmpty() || st.pop() != '[') return false;
                    break;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String input = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        System.out.println(isValid(input)); // true
        System.out.println(isValid(input2)); // true
        System.out.println(isValid(input3)); // false
    }
}