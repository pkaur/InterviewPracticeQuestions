package StringManipulation;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {
            int subStringNum = i + 1;
            int subStringLen = s.length() - i;

            for (int j = 0; j < subStringNum; j++) {
                String subStr = s.substring(j, j + subStringLen);
                if (isPalindrome(subStr)) {
                    return subStr;
                } }
        }return "";
    }

    public static boolean isPalindrome(String s) {

        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("bfhdgf"));
    }

}