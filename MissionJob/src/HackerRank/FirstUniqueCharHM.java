package HackerRank;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharHM {

    public int firstUniqChar(String s) {

        Map<Character,Integer> hm = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++){

            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<s.length(); i++){

            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}
