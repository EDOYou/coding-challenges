package leetcode;

import java.util.Arrays;

public class MaxProductOfTwoInArr2 {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int x = nums[nums.length - 1];
        int y = nums[nums.length - 2];
        return (x - 1) * (y - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 5};
        System.out.println(maxProduct(arr)); // 16
    }
}
