package leetcode;

public class LargestOddNumInString {
    public static String largestOddNumber(String num) {

        for (int i = num.length() - 1; 0 <= i; --i) {

            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String in = "4206";
        System.out.println(largestOddNumber(in)); // ""
    }
}
