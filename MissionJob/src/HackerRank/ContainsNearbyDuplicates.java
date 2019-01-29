package HackerRank;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContainsNearbyDuplicates {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> hm = new LinkedHashMap<>();

        for(int i=0; i<nums.length; i++){

            if(hm.containsKey(nums[i]) && Math.abs(i-hm.get(nums[i])) <=k){
                return true;
            } else {
                hm.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args){

        int[] nums={1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums, 2));

    }
}
