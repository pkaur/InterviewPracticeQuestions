package HackerRank;

public class NumberIsPalindrome {

    public static boolean isPalindrome(int x) {

        int orginalNumber = x, tmpNumber = x, reverse = 0;

        while (tmpNumber > 0) {
            reverse = reverse * 10 + tmpNumber % 10;
            tmpNumber /= 10;
        }

        return orginalNumber == reverse;
    }

    public static boolean isPalindromeString(int x) {

        char[] arr = String.valueOf(x).toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {

            if (arr[i] != arr[arr.length - 1]) {
                return false;
            }
        }
return true;
}



    public static void main(String[] args){

        System.out.println(isPalindromeString(121));
        System.out.println(isPalindromeString(-121));
    }
}
