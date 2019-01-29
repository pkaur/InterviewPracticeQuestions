package HackerRank;

public class DivideWithoutDividendOperator {

    public static int divide(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE){
           dividend = Integer.MIN_VALUE+1;
        }
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        // Update both divisor and
        // dividend positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initialize the quotient
        int quotient = 0;

        while(dividend >= divisor){
            dividend -=divisor;
            quotient++;
        }
        return sign*quotient;
    }

    public static void main(String[] args){

        System.out.println(divide(10,3));
        System.out.println(divide(7,-3));
        System.out.println(divide(56,-3));
        System.out.println(divide(-2147483648,-1));
        System.out.println(divide(2147483647,1));
    }
}
