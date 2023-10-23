package leetcode;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n < 0) return false;
        if (n == 1) return true;
        double x = Math.log(n) / (2.0*Math.log(2));
        return x == (int)x;
    }
}
