package HackerRank;

import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {

        int result = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum - target);

                if (diff == 0) return sum;

                if (diff < min) {
                    min = diff;
                    result = sum;
                }

                if (diff <= target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {-1, 2, 1, -4};

        System.out.println(threeSumClosest(a, 1));
    }
}
