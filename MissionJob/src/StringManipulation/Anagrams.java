package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
        return false;
    }

    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
        if(!hm.containsKey(s.charAt(i))){
            hm.put(s.charAt(i),1);
        } else {
            hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
        }
    }

        for(Character c: t.toCharArray()){

        if(hm.containsKey(c)){
            hm.put(c,hm.get(c)-1);
        } else {
            return false;
        }
    }

        for(Map.Entry<Character,Integer> entry: hm.entrySet()){
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        if(entry.getValue() != 0 ){
            return false;
        }

    }
        return true;

}

public static void main(String[] args){

        System.out.println(isAnagram("anagram", "nagaram"));
}
}
