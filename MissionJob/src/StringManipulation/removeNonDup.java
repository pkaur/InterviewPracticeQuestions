package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class removeNonDup {

    public void removeNonDup(String s1, String s2){
        if(s1==null || s2 == null){
            System.out.println("string cant be null");
        } else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            StringBuffer sb = new StringBuffer();
            Set<Character> m = new HashSet<Character>();
            for(char ch : c1){
                m.add(ch);
            }
            for(char ss : c2){
                if(m.contains(ss)){
                    sb = sb.append(ss);
                } }
            System.out.println(sb);
        } }

    public static void main(String args[]){
        removeNonDup r = new removeNonDup();
        r.removeNonDup("strring", "strrong");
        r.removeNonDup("", "");
        r.removeNonDup("  ", "   ");
        r.removeNonDup(null, null);
        r.removeNonDup(null, "1234");
        r.removeNonDup("12346", "12345");
        r.removeNonDup("sstring", "sstrong");
        r.removeNonDup("sstrign", "sstrgno");
    }
}
