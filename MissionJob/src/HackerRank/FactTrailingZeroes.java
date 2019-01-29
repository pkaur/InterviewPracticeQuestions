package HackerRank;

import java.math.BigInteger;

public class FactTrailingZeroes {
    public static int trailingZeroes(int n) {

        if (n == 0) {
            return 0;
        }
        BigInteger fact = new BigInteger("1");
        while(n >0){

            fact=fact.multiply(new BigInteger(Integer.toString(n)));
            n--;
        }
         int count = 0;

        final BigInteger zero = new BigInteger("0");
        final BigInteger ten = new BigInteger("10");

        while (fact.mod(ten).compareTo(zero) == 0){
            fact = fact.divide(ten);
            count += 1;
        }
        return count;
    }

    public static int zerosWithFactorofFive(int n){
        int rs = 0;
        while (n != 0) {
            rs += (n / 5);
            n /= 5;
        }
        return rs;
    }

    public static void main(String[] args) {

        System.out.println("Count of zeroes " + trailingZeroes(2829));
        System.out.println("Count of zeroes " + zerosWithFactorofFive(2829));
        //System.out.println(trailingZeroes(3));
        //System.out.println(trailingZeroes(6));
        //System.out.println(trailingZeroes(13));
    }
}
