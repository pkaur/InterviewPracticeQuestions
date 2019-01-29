package StringManipulation;

public class Palindrome {

    public static boolean isPalindrome(String s){

        int len = s.length();

        for(int i=0; i<len/2; i++){
            if (s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("noon"));
    }

}
