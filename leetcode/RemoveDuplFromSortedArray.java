package leetcode;

public class RemoveDuplFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        int[] out = new int[k + 1];
        System.arraycopy(nums, 0, out, 0, k + 1);
        return out.length;
    }

    public static void main(String[] args) {
        int[] in = {1, 2, 2};
        int[] expected = {1};
        int k = removeDuplicates(in);

        assert k == expected.length;
        for (int i = 0; i < k; ++i) {
            assert in[i] == expected[i];
        }
    }
}
