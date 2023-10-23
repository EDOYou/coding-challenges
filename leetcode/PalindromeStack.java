package leetcode;

import java.util.Stack;

public class PalindromeStack {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        Stack<Integer> st = new Stack<>();
        int length = (int) (Math.log10(x) + 1);
        int halfLength = length / 2;
        while (st.size() != halfLength) {
            int rem = x % 10;
            x /= 10;
            st.push(rem);
        }

        if (length % 2 != 0) x /= 10;

        while (!st.isEmpty()) {
            int rem = x % 10;
            x /= 10;
            if (st.pop() != rem) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeStack().isPalindrome(123454321));
    }
}
