package HackerRank;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
/*
        if(strs.length == 0 || strs ==null){
            return"";
        }


        String s1= strs[0];
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<strs.length; i++){

            if(strs[i] == null || strs[i].length()==0 || s1.isEmpty()){
                return "";
            }
            char ch=s1.charAt(i-1);

            if(isCharPresent(ch, i-1, strs[i])){

                sb.append(ch);
            }    else {
                return "";
            }
        }
        return sb.toString();*/

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


    public static boolean isCharPresent(char ch, int i, String s) {

        if (s.charAt(i) == ch) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String[] s = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
