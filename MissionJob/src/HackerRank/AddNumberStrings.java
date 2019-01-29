package HackerRank;

public class AddNumberStrings {
    public static String addStrings(String num1, String num2) {

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int p = 0, q = 0;

            if (i >= 0) p = num1.charAt(i) - '0';
            if (j >= 0) q = num2.charAt(j) - '0';

            int sum = p + q + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(addStrings("123", "456"));
        System.out.println(addStrings("888", "456"));
    }
}
