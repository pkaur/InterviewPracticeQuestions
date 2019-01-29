package Arrays;

public class MissingNumber {

    public static int findMissingNumber(int[] ar, int count){

        int actualsum=0;
        int expectedSum = count *(count+1)/2;

        for (int i=0; i<ar.length; i++){

            actualsum = actualsum + ar[i];
        }

        return expectedSum-actualsum;
    }

    public static void main(String[] args){
        int[] ar = {1, 2,3,4,6};

        System.out.println(MissingNumber.findMissingNumber(ar, 6));

    }
}
