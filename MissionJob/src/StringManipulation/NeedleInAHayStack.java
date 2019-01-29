package StringManipulation;

public class NeedleInAHayStack {

    public static int strStr(String haystack, String needle) {
        int res = -1;
        if (needle.equals(""))
            return 0;

        if (haystack.equals(""))
            return -1;

        for (int i = 0; i < haystack.length()-needle.length(); i++)
            if (haystack.charAt(i) == needle.charAt(0)) {
                String tmp = haystack.substring(i, needle.length() + i);
                if (tmp.equals(needle)) {
                    res = i;
                    return res;
                }
            }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(strStr("hetffgllo", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("aaa", "aaaa"));
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("", null));

    }
}
