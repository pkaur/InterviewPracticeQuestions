package HackerRank;

public class CountBits {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int mask = 1, count = 0;
        for(int i=0; i < 32; i++){
            if( (n & mask) == 1)
                ++count;
            n >>= 1;
        }
        return count;

    }

    public static void main(String[] args){

        System.out.println("00000000000000000000000000001011 : " + hammingWeight(00000000000000000000000000001011));
        System.out.println("00000000000000000000000010000000 : " + hammingWeight(00000000000000000000000010000000));
        //System.out.println("11111111111111111111111111111101 : " + hammingWeight(11111111111111111111111111111101));
    }
}
