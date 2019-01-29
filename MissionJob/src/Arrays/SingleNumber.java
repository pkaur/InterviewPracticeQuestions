package Arrays;

import java.util.Arrays;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        int count = 1;
        int last = nums[0];
        ;

        for (int i = 1; i < nums.length - 1; i++) {


            if (last == nums[i]) {

                count++;
                if (count > 1) {
                    continue;
                } else {
                    last = nums[i];
                    count = 1;
                }
            }

        }

        return last;
    }

    public static void main(String args[]) {

        int[] a = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(a));
    }
}
