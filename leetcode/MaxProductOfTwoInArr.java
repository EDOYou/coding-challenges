package leetcode;

public class MaxProductOfTwoInArr {
    public static int maxProduct(int[] nums) {
        int biggest = 0;
        int secondBiggest = 0;
        for (int num : nums) {
            if (num > biggest) {
                secondBiggest = biggest;
                biggest = num;
            } else {
                secondBiggest = Math.max(secondBiggest, num);
            }
        }

        return (biggest - 1) * (secondBiggest - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        System.out.println(maxProduct(arr)); // 12
    }
}
