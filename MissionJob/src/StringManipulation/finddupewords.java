package StringManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class finddupewords {

    public static String[] findDupes(String str) {

        String[] words = str.split(" ");
        List<String> ls = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 1;

        for (int i = 0; i < words.length; i++) {

            if (hm.containsKey(words[i])) {
                hm.put(words[i], count + 1);
            } else {
                hm.put(words[i], count);
            }

        }

        for (String s : hm.keySet()) {
            if (hm.get(s) > 1) {
                ls.add(s);
            }
        }

        String[] arr= new String[ls.size()];
        for(int i=0; i<ls.size(); i++){

            arr[i] = ls.get(i);
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println(finddupewords.findDupes("I am I am Puneet Kaur"));
    }
}

