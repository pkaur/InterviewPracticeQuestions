package HackerRank;

public class SquareRoot {
    public static int mySqrt(int x) {

        long i=0;
        while(i*i<=x){

            i++;
        }
        return (int) i-1;
    }

    public static void main(String[] args){

        System.out.println(mySqrt(8));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(6));
        System.out.println(mySqrt(19));
    }
}
