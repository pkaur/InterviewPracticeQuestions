package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set set = new HashSet<>();
        for(int val : nums) {
            if(!set.add(val))
                return true;
        }
        return false;
    }

    public static void main(String[] args){

        int[] a= {1,2,3,1};
        System.out.println(containsDuplicate(a));
    }
}
