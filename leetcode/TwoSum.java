package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();

    // Test case 1
    int[] nums1 = { 2, 7, 11, 15 };
    int target1 = 9;
    System.out.println(Arrays.toString(ts.fastTwoSum(nums1, target1))); // Expected output: [0, 1]

    // Test case 2
    int[] nums2 = { 3, 2, 4 };
    int target2 = 6;
    System.out.println(Arrays.toString(ts.fastTwoSum(nums2, target2))); // Expected output: [1, 2]

    // Test case 3
    int[] nums3 = { 3, 3 };
    int target3 = 6;
    System.out.println(Arrays.toString(ts.fastTwoSum(nums3, target3))); // Expected output: [0, 1]
  }

  // ONE WAY (USES MUCH MEMORY AS BOXING OPERATION, ARRAY TO LIST CONVERSION ETC. HAPPEN)
  public int[] twoSum(int[] nums, int target) {
    List<Integer> numList = Arrays
      .stream(nums)
      .boxed()
      .collect(Collectors.toList());
    HashSet<Integer> hs = new HashSet<>(numList);
    int trackInd = -1;
    int trackSecInd = -1;
    int targetSearch = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; ++i) {
      targetSearch = target - nums[i];
      if (hs.contains(targetSearch) && numList.indexOf(targetSearch) != i) {
        trackInd = i;
        trackSecInd = numList.indexOf(targetSearch);
        break;
      }
    }
    return new int[] { trackSecInd, trackInd };
  }

  // SECOND WAY (FASTER)
  public int[] fastTwoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; ++i) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No solution found");
  }
}
