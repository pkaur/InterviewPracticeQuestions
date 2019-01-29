package StringManipulation;

public class PalindromePractice {

    public static boolean isPalindrome(String str){

        int len=str.length();

        for (int i=0; i<len/2; i++){

            if (str.charAt(i) != str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println(isPalindrome("CIVIC"));
        System.out.println(isPalindrome("APPLE"));
        System.out.println(isPalindrome("RADAR"));
        System.out.println(isPalindrome("MADAM"));
    }
}
