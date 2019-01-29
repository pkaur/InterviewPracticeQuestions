package HackerRank;

import StringManipulation.ListOfList;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        HashSet<List<Integer>> ret = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) > 0)
                    break;
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) > 0)
                        break;
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        ArrayList<Integer> l = new ArrayList();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        Collections.sort(l);
                        ret.add(l);
                    }
                }
            }
        }
        return new ArrayList(ret);

      /*  Arrays.sort(nums);
        List> result = new ArrayList<>();

        //Map for easy check.
        Map map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = -(nums[i] + nums[j]);
                //Check if sum is present in map.
                //For cases like : input = {2,-4} this second condition is used.
                if (map.containsKey(sum) && map.get(sum) > j) {
                    j = map.get(nums[j]);
                    result.add(Arrays.asList(nums[i], nums[j], sum));
                }
            }
            i = map.get(nums[i]);
        }
        return result;

*/
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
