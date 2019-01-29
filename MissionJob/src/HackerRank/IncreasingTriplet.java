package HackerRank;

public class IncreasingTriplet {

    public static boolean increasingTriplet(int[] ar){

        if(ar== null || ar.length <3){
            return false;
        }

        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0; i<ar.length; i++){

            if(ar[i] <= min){
                min =ar[i];
            } else if(ar[i] <= secondMin){
                secondMin = ar[i];
            } else {
                return true;
            }
        }
return false;
    }

    public static void main(String [] args){

        int[] ar={3,4,1,2};
        System.out.println(increasingTriplet(ar));
    }
}
