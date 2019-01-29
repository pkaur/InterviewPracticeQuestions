package HackerRank;

public class IsPalindromeRemovingExtraCharacters {

    public static boolean isPalindrome(String s) {

        if(s.length()==0){
            return true;
        }

        StringBuilder sb = new StringBuilder();

        for(Character ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }

        String newString = sb.toString().toLowerCase();
        System.out.println("New String: " + newString);
        int length= newString.length();
        for(int i=0; i< length/2; i++){

            if(newString.charAt(i) != newString.charAt(length-i-1)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
