package leetcode;

public class GoodSubarray {
    public int maximumScore(int[] nums, int k) {
        int left = k, right = k, minNum = nums[k];
        int goodSubarrScore = minNum;

        while (left > 0 || right < nums.length - 1) {
            if (left == 0 || (right < nums.length - 1 && nums[right + 1] > nums[left - 1])) {
                right++;
                minNum = Math.min(minNum, nums[right]);
            } else {
                left--;
                minNum = Math.min(minNum, nums[left]);
            }

            goodSubarrScore = Math.max(goodSubarrScore, minNum * (right - left + 1));
        }
        return goodSubarrScore;
    }

    public static void main(String[] args) {
        GoodSubarray gs = new GoodSubarray();
        int[] nums = new int[] {1, 4, 3, 7, 4, 5};
        System.out.println("The optimal array with max score is " + gs.maximumScore(nums, 3));
    }
}
