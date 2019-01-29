package StringManipulation;

public class IsSubstring {

    public static boolean isSubstring(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        } else {
            String s3 = word1 + word1;

            if (s3.contains(word2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        System.out.println(IsSubstring.isSubstring("helloworldtome", "hello"));
        System.out.println(IsSubstring.isSubstring("helloworldtome", "worldtomehello"));
        System.out.println(IsSubstring.isSubstring("helloworldtome", "lloworldtomehe"));
        System.out.println(IsSubstring.isSubstring("helloworldtome", "1672637890123"));
    }
}
