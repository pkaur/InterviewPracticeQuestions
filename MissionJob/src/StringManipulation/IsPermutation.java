package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class IsPermutation {


    public static boolean isPemutation(String s1, String s2) {

        int count = 1;
        if (s1.length() != s2.length() || s1 == null || s2 == null) {
            return false;
        }

        Map<Character, Integer> hm = new HashMap();

        for (Character c : s1.toCharArray()) {

            if (!hm.containsKey(c)) {

                hm.put(c, count);
            } else {
                hm.put(c, count + 1);
            }
        }

        for (Character c : s2.toCharArray()) {

            if (!hm.containsKey(c)) {
                return false;
            } else
                hm.put(c, count - 1);
        }

        for (Character c : hm.keySet()) {

            if (hm.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPemutation("Puneet", "cdhcd"));
        System.out.println(isPemutation("", "cdhcd"));
        System.out.println(isPemutation("Puneet", ""));
        //System.out.println(isPemutation(null, "cdhcd"));
        System.out.println(isPemutation("Puneet", "teepun"));
        System.out.println(isPemutation("Puneet", "teePun"));
        System.out.println(isPemutation("T%^%$^$%^", "$%%&%&%^&"));
        System.out.println(isPemutation("%^&*()", "&*^()%"));
        System.out.println(isPemutation("p", "P"));
        System.out.println(isPemutation("eeee", "eee"));
    }


}
