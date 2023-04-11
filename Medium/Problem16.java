package Medium;

import java.util.Arrays;

class Problerm16 {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return target - diff;
    }
}
