package leetcode;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int reader = 0;
        int writer = 0;

        while (reader < nums.length) {

            if (nums[reader] == val) {
                reader++;
            } else {
                nums[writer++] = nums[reader++];
            }
        }
        return writer;
    }
}
