package StringManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NearestPalindrome {

    int num;
    int fwp;
    int bwp;
    boolean flag;

    public boolean checkPalindrome(int num) {
        int rev = 0;
        this.num = num;

        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }

        if (rev == this.num) {
            flag = true;
        } else
            flag = false;

        return flag;

    }

    public void nearPalindrome(int num) {
        int temp = num;
        num = temp - 1;

        while (!checkPalindrome(num)) {
            num = num - 1;
        }
        bwp = num;
        num = temp + 1;

        while (!checkPalindrome(num)) {
            num = num + 1;
        }
        fwp = num;
        num = temp;

        if ((num - bwp) < (fwp - num)) System.out.println("Nearest Palindrome is " + bwp);
        else if ((num - bwp) > (fwp - num)) System.out.println("Nearest Palindrome is " + fwp);
        else if ((num - bwp) == (fwp - num)) System.out.println("Two Nearest palindrome no are " + bwp + " and " + fwp);
    }


    public static void main(String[] args) {
        NearestPalindrome p = new NearestPalindrome();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            System.out.println("enter any number greater than 99 to check for the paindrome ");

            num = Integer.parseInt(br.readLine());
        } catch (Exception e) {
        }
        if (num < 100) {
            System.out.println("Please enter the number greater or equals to 100 'try Again'");
        } else {
            boolean flag = p.checkPalindrome(num);
            if (flag) {
                System.out.println("Number is palindrome");
            } else {
                p.nearPalindrome(num);

            }
        }
    }
}
