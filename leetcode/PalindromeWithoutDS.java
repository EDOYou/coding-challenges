package leetcode;

public class PalindromeWithoutDS {
    public boolean isPalindrome(int x) {
        if (x >= 0 && x < 10) return true;
        if (x < 0 || x % 10 == 0) return false;

        int reversedX = 0;
        while (x > reversedX) {
            reversedX = reversedX * 10 + x % 10;
            x /= 10;
            System.out.println(x);
            System.out.println(reversedX);
        }
        return reversedX == x || x == reversedX / 10;
    }
}
