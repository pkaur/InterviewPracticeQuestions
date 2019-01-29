package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

    public static boolean isIsomorphic(String string1, String string2) {

        if(string1==null) return false;
        if(string2==null) return false;

        if(string1.length()!=string2.length())
            return false;

        Map<Character,Character> map=new HashMap<>();

        for(int i=0;i<string1.length();i++){
            char c1=string1.charAt(i);
            char c2=string2.charAt(i);

            if(map.get(c1)!=null && !map.get(c1).equals(c2)){
                return false;
            }
            map.put(c1, c2);
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isIsomorphic("ab","aa"));

    }
}

