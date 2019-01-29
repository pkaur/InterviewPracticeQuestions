package HackerRank;

public class NumberIsPowerOfTwo {

    public static boolean isPowerofTwo(int n){

        while(n>1){

            if(n%2 != 0){
                return false;
            }

            n=n/2;
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println(isPowerofTwo(6));
        System.out.println(isPowerofTwo(8));
        System.out.println(isPowerofTwo(24));
        System.out.println(isPowerofTwo(512));
    }
}
