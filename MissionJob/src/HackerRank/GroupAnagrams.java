package HackerRank;

import java.util.*;

public class GroupAnagrams {

    static Map<String, List<String>> hashMap = new LinkedHashMap<>();
    static List<List<String>> list =  new ArrayList<>();

    public static List<List<String>> groupAnagrams(String[] strs) {
    for(String str : strs) {
        char[] temp  = str.toCharArray() ;
        Arrays.sort(temp);
        String key = new String(temp);

        if(hashMap.containsKey(key)) {
            List<String> tmp = hashMap.get(key);
            tmp.add(str);
            hashMap.put(key, tmp);
        } else {
            List<String> tmp = new ArrayList();
            tmp.add(str);
            hashMap.put(key, tmp);
        }

    }

    for(String key : hashMap.keySet()) {
        list.add(hashMap.get(key));
    }

    return list ;

}

public static void main(String[] args){

        String[] ar = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(ar));
}
}
