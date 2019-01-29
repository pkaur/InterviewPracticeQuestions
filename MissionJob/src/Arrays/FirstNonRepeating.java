package Arrays;

public class FirstNonRepeating {

    public static int firstNonRepeating(int[] ar){

        for(int i=0; i<ar.length; i++){

            for(int j=i+1; j<ar.length; j++){

                if(ar[i] != ar[j]){
                    return ar[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args){

        int[] arr={10, 5, 3, 4, 3, 5, 6};
        System.out.println(firstNonRepeating(arr));
    }
}
