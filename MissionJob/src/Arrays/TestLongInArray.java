package Arrays;

import java.math.BigInteger;

public class TestLongInArray {

    public static void testEvenOdd(BigInteger num){

            //for(int i=0; i<arr.length;i++){
            BigInteger one = new BigInteger("1");
            if(num.and(one).equals(BigInteger.ZERO)){
                System.out.println(num + " is even");
            } else
            {
                System.out.println(num + " is odd");
            }


    }

    public static void main(String[] args){

        BigInteger arr= new BigInteger("3375152182143856118451852315996741233006489780574184654817389047");
        testEvenOdd(arr);
    }
}
